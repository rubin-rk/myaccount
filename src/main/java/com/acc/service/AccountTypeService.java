package com.acc.service;

import com.acc.entity.AccountType;
import org.springframework.beans.factory.annotation.Autowired;
import com.acc.respository.AccountTypeRep;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
@Service

public class AccountTypeService {
    @Autowired
    AccountTypeRep accountTypeRep;
    //find all list
    public List<AccountType> findAll(){
        return (List<AccountType>) accountTypeRep.findAll();
    }
    //create new row in table
    public AccountType createNewTable(AccountType accountType){
        return accountTypeRep.save(accountType);
    }
    //update row
    public AccountType update(AccountType incoming){
        return accountTypeRep.save(incoming);
    }
    //delete row
    public String delete(int actype_id){
        accountTypeRep.deleteById(actype_id);
                return "delete success";
    }
}
