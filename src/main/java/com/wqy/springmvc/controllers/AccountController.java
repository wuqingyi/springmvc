package com.wqy.springmvc.controllers;

import com.wqy.springmvc.entities.Account;
import com.wqy.springmvc.mappers.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountDao accountDao;

    @RequestMapping(value = "/accounts", produces = "application/json;charset=UTF-8")
    public Account getAccounts() {
        return accountDao.getAllAccount().get(0);
    }
}
