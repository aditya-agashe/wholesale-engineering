package au.com.digisui.wholesaleengineering.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
public class AccountTransaction {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer accountTransactionId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "accountId")
    private Account account;

    private Date transactionDate;

    private BigDecimal transactionAmount;

    private String transactionNarrative;

    public Integer getAccountTransactionId() {
        return accountTransactionId;
    }

    public void setAccountTransactionId(Integer accountTransactionId) {
        this.accountTransactionId = accountTransactionId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
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
