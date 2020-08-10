package au.com.digisui.wholesaleengineering.converter;

import au.com.digisui.wholesaleengineering.dto.AccountDto;
import au.com.digisui.wholesaleengineering.dto.AccountTransactionDto;
import au.com.digisui.wholesaleengineering.entity.Account;
import au.com.digisui.wholesaleengineering.entity.AccountTransaction;
import au.com.digisui.wholesaleengineering.entity.AccountType;
import au.com.digisui.wholesaleengineering.entity.Currency;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccountConverterTest {

    private Account account;

    private AccountDto accountDto;

    private AccountConverter accountConverter = new AccountConverter();

    @BeforeEach
    void setUp() {
        account = new Account();
        account.setAccountName("aditya");
        account.setAccountNumber("12345");
        account.setAccountId(1);
        AccountType accountType = new AccountType();
        accountType.setAccountTypeId(1);
        accountType.setAccountTypeName("Saving");
        account.setAccountType(accountType);
        Currency currency = new Currency();
        currency.setCurrencyId(61);
        currency.setCurrencyName("AUD");
        account.setCurrency(currency);
        accountDto = accountConverter.toDto(account);
    }

    @Test
    void shouldMapAccountId() {
        assertEquals(account.getAccountId(), accountDto.getAccountId());
    }

    @Test
    void shouldMapAccountName() {
        assertEquals(account.getAccountName(), accountDto.getAccountName());
    }

    @Test
    void shouldMapAccountNumber() {
        assertEquals(account.getAccountNumber(), accountDto.getAccountNumber());
    }

    @Test
    void shouldMapCurrency() {
        assertEquals(account.getCurrency().getCurrencyName(), accountDto.getCurrency().getCurrencyName());
    }

    @Test
    void shouldMapAccountTypeName() {
        assertEquals(account.getAccountType().getAccountTypeName(), accountDto.getAccountType().getAccountTypeName());
    }


}