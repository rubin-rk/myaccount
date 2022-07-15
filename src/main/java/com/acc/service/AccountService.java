package com.acc.service;

import com.acc.entity.Account;
import com.acc.respository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    //get account details
    public List<Account>getAccount(){
        return (List<Account>) accountRepository.findAll();
    }

    //create new table
    public 
}
