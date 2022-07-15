package com.acc;

import com.acc.entity.AccountType;
import com.acc.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AccountTypeController {
    @Autowired
    private AccountTypeService accountTypeService;

    // get method for find all
    @RequestMapping(value = "/accountType/allList",method = RequestMethod.GET)
    public List<AccountType>findAll(){
        return accountTypeService.findAll();
    }
    //post method for create table
    @PostMapping(value = "/account/createTable")
    public AccountType createTable(@RequestBody AccountType accountType){
        return accountTypeService.createNewTable(accountType);
    }
}
