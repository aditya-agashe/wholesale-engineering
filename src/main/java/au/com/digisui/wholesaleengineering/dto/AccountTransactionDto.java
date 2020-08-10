package au.com.digisui.wholesaleengineering.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;
import java.sql.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AccountTransactionDto {
    private Integer accountTransactionId;
    private AccountDto account;
    private Date transactionDate;
    private BigDecimal transactionAmount;
    private String transactionNarrative;

    public Integer getAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(Integer accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }
}
