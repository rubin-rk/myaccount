package com.acc;

import com.acc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.acc.service.AccountService;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    //find all table
    @RequestMapping (value="/account",method = RequestMethod.GET)
    public List<Account>getAccount(){
        return accountService.getAccount();
    }

    //save
    @PostMapping(value = "/account/createNewTable")
    public Account createTable(@RequestBody Account account){
        return accountService.createTable(account);
    }
    @GetMapping(value = "/hi")
    public String hello(){
        return "rubinkumar";
    }
}
