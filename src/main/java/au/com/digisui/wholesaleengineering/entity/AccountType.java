package au.com.digisui.wholesaleengineering.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccountType {

    @Id
    private Integer accountTypeId;

    private String accountTypeName;

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

}
