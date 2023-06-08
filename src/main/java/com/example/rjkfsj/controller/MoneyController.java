package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Money;
import com.example.rjkfsj.entity.Payment;
import com.example.rjkfsj.mapper.MoneyMapper;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MoneyController {
    @Autowired
    private MoneyMapper moneyMapper;

    @RequestMapping(value = "/money/sub",method = RequestMethod.POST)
    public Money pament(@RequestBody(required = true) Money money){
        int peopleid = money.getPeopleid();
        double allmoney = money.getAllmoney();
        return moneyMapper.submoney(allmoney,peopleid);

    }

    @RequestMapping(value = "/money/add",method = RequestMethod.POST)
    public Money addmon(@RequestBody(required = true) Money money){
        int peopleid = money.getPeopleid();
        double allmoney = money.getAllmoney();
        return moneyMapper.addmoney(allmoney,peopleid);

    }
}
