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
    public List<Transaction>findAll(){
        return (List<Transaction>)transRepository.findAll();
    }
}
