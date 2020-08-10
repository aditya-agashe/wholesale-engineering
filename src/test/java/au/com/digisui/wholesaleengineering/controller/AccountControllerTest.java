package au.com.digisui.wholesaleengineering.controller;

import au.com.digisui.wholesaleengineering.error.ResourceNotFoundException;
import au.com.digisui.wholesaleengineering.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AccountController.class)
class AccountControllerTest {

    @MockBean
    private AccountService accountService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnOKResponseStatusIfAllAccountsAreRetrievedSuccessfully()  throws Exception {
        Mockito.when(accountService.getAllAccounts()).thenReturn(Arrays.asList());
        mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }

    @Test
    void shouldReturnNotFoundResponseStatusIfAccountIsNotFound() throws Exception {
        Mockito.when(accountService.getTransactionsByAccountId(1)).thenThrow(new ResourceNotFoundException("Account id 1 not found"));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/transactions"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.NOT_FOUND.value()));
    }

    @Test
    void shouldReturnBadRequestResponseStatusIfUnknownErrorOccurs() throws Exception {
        Mockito.when(accountService.getTransactionsByAccountId(1)).thenThrow(new RuntimeException("Unknown Error"));
        mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/transactions"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.BAD_REQUEST.value()));
    }

    @Test
    void shouldReturnOKResponseStatusIfAllAccountTransactionsAreRetrievedSuccessfully() throws Exception {
        Mockito.when(accountService.getTransactionsByAccountId(1)).thenReturn(Arrays.asList());
        mockMvc.perform(MockMvcRequestBuilders.get("/api/accounts/1/transactions"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }
}