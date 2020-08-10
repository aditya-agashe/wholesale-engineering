package au.com.digisui.wholesaleengineering.service;

import au.com.digisui.wholesaleengineering.converter.AccountConverter;
import au.com.digisui.wholesaleengineering.converter.AccountTransactionConverter;
import au.com.digisui.wholesaleengineering.dto.AccountDto;
import au.com.digisui.wholesaleengineering.dto.AccountTransactionDto;
import au.com.digisui.wholesaleengineering.entity.Account;
import au.com.digisui.wholesaleengineering.error.ResourceNotFoundException;
import au.com.digisui.wholesaleengineering.repository.AccountRepository;
import au.com.digisui.wholesaleengineering.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    @Autowired
    private AccountConverter accountConverter;

    @Autowired
    private AccountTransactionConverter accountTransactionConverter;

    @Autowired
    public List<AccountDto> getAllAccounts() {
        return accountRepository.findAll().stream().map(accountConverter::toDto).collect(Collectors.toList());
    }

    public List<AccountTransactionDto> getTransactionsByAccountId(Integer accountId) {
        Optional<Account> optional = accountRepository.findById(accountId);
        if (optional.isPresent()) {
            return accountTransactionConverter.toAccountTransactionDto(accountTransactionRepository.findByAccountAccountId(accountId));
        } else {
            throw new ResourceNotFoundException(String.format("Account id %s not found", accountId));
        }
    }
}
