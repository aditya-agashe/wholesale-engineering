package au.com.digisui.wholesaleengineering.converter;

import au.com.digisui.wholesaleengineering.dto.AccountDto;
import au.com.digisui.wholesaleengineering.entity.Account;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter {

    private final DozerBeanMapper mapper = new DozerBeanMapper();

    public AccountDto toDto(Account account) {
        AccountDto accountDto = mapper.map(account, AccountDto.class);
        return accountDto;
    }
}
