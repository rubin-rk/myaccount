package service;

import entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import respository.AccountRepository;

import java.util.List;
@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    //get
    public List<Account>getaccount(){
        return (List<Account>) accountRepository.findAll();


    }
}
