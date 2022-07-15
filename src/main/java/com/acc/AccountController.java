package com.acc;

import com.acc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.acc.service.AccountService;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping (value="/account",method = RequestMethod.GET)
    public List<Account>getAccount(){
        return accountService.getaccount();
    }
    @GetMapping(value = "/hi")
    public String hello(){
        return "rubinkumar";
    }
}
