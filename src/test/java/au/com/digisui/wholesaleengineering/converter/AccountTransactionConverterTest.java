package au.com.digisui.wholesaleengineering.converter;

import au.com.digisui.wholesaleengineering.dto.AccountTransactionDto;
import au.com.digisui.wholesaleengineering.entity.AccountTransaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class AccountTransactionConverterTest {

    private AccountTransaction accountTransaction;

    private AccountTransactionDto accountTransactionDto;

    private AccountTransactionConverter accountTransactionConverter = new AccountTransactionConverter();

    @BeforeEach
    void setUp() {
        accountTransaction = new AccountTransaction();
        accountTransaction.setAccountTransactionId(1);
        accountTransaction.setTransactionAmount(BigDecimal.TEN);
        accountTransaction.setTransactionDate(new Date(Calendar.getInstance().getTime().getTime()));
        accountTransaction.setTransactionNarrative("Narra");
        accountTransactionDto = accountTransactionConverter.toAccountTransactionDto(Arrays.asList(accountTransaction)).get(0);
    }

    @Test
    void shouldMapAccountTransactionId() {
        assertEquals(accountTransaction.getAccountTransactionId(), accountTransactionDto.getAccountTransactionId());
    }

    @Test
    void shouldMapTransactionAmount() {
        assertEquals(accountTransaction.getTransactionAmount(), accountTransactionDto.getTransactionAmount());
    }

    @Test
    void shouldMapTransactionDate() {
        assertEquals(accountTransaction.getTransactionDate(), accountTransactionDto.getTransactionDate());
    }

    @Test
    void shouldMapgetTransactionNarrative() {
        assertEquals(accountTransaction.getTransactionNarrative(), accountTransactionDto.getTransactionNarrative());
    }


}