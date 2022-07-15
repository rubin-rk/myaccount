package com.acc.service;

import com.acc.entity.Transaction;
import com.acc.respository.TransRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
