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
    @PostMapping(value = "/accounttype/createTable")
    public AccountType createTable(@RequestBody AccountType accountType){
        return accountTypeService.createNewTable(accountType);
    }
    //put method --update
    @PutMapping(value = "/accounttype/update")
    public AccountType update(@RequestBody AccountType incoming){
        return accountTypeService.update(incoming);
    }
    @DeleteMapping(value = "/accounttype/delete/{id}")
    public String delete(@PathVariable("id")int actype_id){
        return accountTypeService.delete(actype_id);
    }
}
