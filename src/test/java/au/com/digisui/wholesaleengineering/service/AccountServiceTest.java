package au.com.digisui.wholesaleengineering.service;

import au.com.digisui.wholesaleengineering.converter.AccountTransactionConverter;
import au.com.digisui.wholesaleengineering.dto.AccountTransactionDto;
import au.com.digisui.wholesaleengineering.entity.Account;
import au.com.digisui.wholesaleengineering.entity.AccountTransaction;
import au.com.digisui.wholesaleengineering.error.ResourceNotFoundException;
import au.com.digisui.wholesaleengineering.repository.AccountRepository;
import au.com.digisui.wholesaleengineering.repository.AccountTransactionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private AccountTransactionRepository accountTransactionRepository;

    @Mock
    private AccountTransactionConverter accountTransactionConverter;

    @InjectMocks // Quick and dirty. Ideally avoid
    private AccountService accountService;

    private final int accountId = 1;

    @Test()
    void shouldThrowResourceNotFoundExceptionIfAccountIsNotFound() {
        when(accountRepository.findById(accountId)).thenReturn(Optional.empty());
        Assertions.assertThrows(ResourceNotFoundException.class, () -> {
            accountService.getTransactionsByAccountId(accountId);
        });
    }

    @Test()
    void shouldReturnAccountTransactionsIfForTheAccount() {
        List<AccountTransactionDto> accountTransactionDtos = Arrays.asList(new AccountTransactionDto());
        when(accountRepository.findById(accountId)).thenReturn(Optional.of(new Account()));
        when(accountTransactionRepository.findByAccountAccountId(accountId)).thenReturn(new ArrayList<>());
        when(accountTransactionConverter.toAccountTransactionDto(Mockito.anyList())).thenReturn(accountTransactionDtos);
        assertEquals(accountTransactionDtos.size(), accountService.getTransactionsByAccountId(accountId).size());
    }
}