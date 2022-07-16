package com.acc;

import com.acc.entity.Transaction;
import com.acc.service.TransService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class TransactionController {
    @Autowired
    private TransService transService;
    //get method for find all
    @RequestMapping(value = "/transaction/allList",method = RequestMethod.GET)
    public List<Transaction>findAll(){
        return transService.findAll();
    }
    //post method for create new row in table
    @PostMapping(value = "/transcation/createNewTable")
    public Transaction createNewTable(@RequestBody Transaction transaction){
        return transService.createNewTable(transaction);
    }
    //put method- create table
    @PutMapping(value = "/transcation/update")
    public Transaction update(@RequestBody Transaction incoming){
        return transService.update(incoming);
    }
    //detete
    @DeleteMapping(value = "/transcation/delete/{id}")
    public String delete(@PathVariable ("id")int transid){
        return transService.delete(transid);
    }
    @GetMapping(value = "/transaction/findid/{id}")
    public Optional<Transaction>findId(@PathVariable("id")int findid){
        return transService.findId(findid);
    }
}
