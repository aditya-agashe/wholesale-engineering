package au.com.digisui.wholesaleengineering.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {

    @Id
    private Integer currencyId;

    private String currencyName;

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

}
