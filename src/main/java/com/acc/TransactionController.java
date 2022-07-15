package com.acc;

import com.acc.entity.Transaction;
import com.acc.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class TransactionController {
    @Autowired
    private TransService transService;
    @RequestMapping(value = "/transaction/allList",method = RequestMethod.GET)
    public List<Transaction>findAll(){
        return transService.findAll();
    }
}
