package com.acc;

import com.acc.entity.AccountType;
import com.acc.service.AccountTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AccountTypeController {
    @Autowired
    private AccountTypeService accountTypeService;

    //find all
    @RequestMapping(value = "/accountType/allList",method = RequestMethod.GET)
    public List<AccountType>findAll(){
        return accountTypeService.findAll();
    }
}
