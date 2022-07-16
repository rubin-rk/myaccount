package com.acc.service;

import com.acc.entity.Account;
import com.acc.entity.Transaction;
import com.acc.respository.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TransService {
    @Autowired
    TransRepository transRepository;
    //find all table
    public List<Transaction>findAll(){
        return (List<Transaction>)transRepository.findAll();
    }
    //create new row for table
    public Transaction createNewTable(Transaction transaction){
        return transRepository.save(transaction);
    }
    //update table
    public Transaction update(Transaction incoming){
        return transRepository.save(incoming);
    }

    //delete row
    public String delete(int transid){
                transRepository.deleteById(transid);
             return "delete success";
    }
    public Optional<Transaction>findId(int findid){
        return transRepository.findById(findid);
    }

}
