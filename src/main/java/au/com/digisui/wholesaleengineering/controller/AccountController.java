package au.com.digisui.wholesaleengineering.controller;

import au.com.digisui.wholesaleengineering.dto.AccountDto;
import au.com.digisui.wholesaleengineering.dto.AccountTransactionDto;
import au.com.digisui.wholesaleengineering.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/accounts")
    public List<AccountDto> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @RequestMapping("/accounts/{accountId}/transactions")
    public List<AccountTransactionDto> getTransactionsByAccountId(@PathVariable Integer accountId) {
        return accountService.getTransactionsByAccountId(accountId);
    }
}
