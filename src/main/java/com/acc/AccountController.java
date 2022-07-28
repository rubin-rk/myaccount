package com.acc;

import com.acc.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.acc.service.AccountService;

import java.util.List;
import java.util.Optional;

//@RestController
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    @GetMapping(value = "/")
    public String html(){
        return "htmlFile";
    }
    //get method ---find all table
    @RequestMapping (value="/account",method = RequestMethod.GET)
    public String getAccount(Model model){
        model.addAttribute( "allAccount",accountService.getAccount());
        return "accountList";
    }
    @GetMapping("/add")
    public String lunchAddBookPage(Model model) {
        model.addAttribute("acc", new Account());
        return "createTable";
    }

    //post method --save new row
    @PostMapping( "/create")
    public String createTable(@RequestBody Account account){
        accountService.createTable(account);
        return "redirect:/account";
    }
    //put method--update table(iruntha update pannum illa na create pannum)
    @PutMapping(value = "/account/update")
    public Account update(@RequestBody Account incoming){
        return accountService.update(incoming);
    }
    //delete method --delete row
    @DeleteMapping(value = "/account/delete/{id}")
        public String delete(@PathVariable ("id") int acNo){
            return accountService.delete(acNo);

    }
    //find id
    @GetMapping(value = "/account/findid/{id}")
    public Optional<Account> findId(@PathVariable ("id")int findid){
        return accountService.findId(findid);
    }
    @GetMapping(value = "/hi")
    public String hello(){ return "demo";
    }

    @GetMapping(value = "/run")
    @ResponseBody
    public String run1(@RequestParam("number")int number){
        String result;
       if (number%2==0){
           result="true";
       }
       else{
           result="false";
       }
       return result;
    }
}
