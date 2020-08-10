package au.com.digisui.wholesaleengineering.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Account {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer accountId;

    private String accountNumber;

    private String accountName;

    @ManyToOne(optional = false)
    @JoinColumn(name = "accountTypeId")
    private AccountType accountType;

    @ManyToOne(optional = false)
    @JoinColumn(name = "currencyId")
    private Currency currency;

    @OneToMany
    @JoinColumn(name = "accountId")
    private List<AccountTransaction> accountTransactions;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public List<AccountTransaction> getAccountTransactions() {
        return accountTransactions;
    }

    public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }


}
