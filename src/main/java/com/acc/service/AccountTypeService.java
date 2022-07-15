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
    public List<AccountType> findAll(){
        return (List<AccountType>) accountTypeRep.findAll();
    }
}
