package au.com.digisui.wholesaleengineering.converter;

import au.com.digisui.wholesaleengineering.dto.AccountTransactionDto;
import au.com.digisui.wholesaleengineering.entity.AccountTransaction;
import org.dozer.DozerBeanMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTransactionConverter {

    private final DozerBeanMapper mapper = new DozerBeanMapper();

    public List<AccountTransactionDto> toAccountTransactionDto(List<AccountTransaction> accountTransactionList) {
        List<AccountTransactionDto> accountTransactionDtoList = new ArrayList<>();
        accountTransactionList.forEach(accountTransaction -> {
            accountTransactionDtoList.add(mapper.map(accountTransaction, AccountTransactionDto.class));
        });
        return accountTransactionDtoList;
    }

}
