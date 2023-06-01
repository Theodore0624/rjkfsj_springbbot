package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Recharge;
import com.example.rjkfsj.mapper.RechargeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RechargeController {
    @Autowired
    private RechargeMapper rechargeMapper;

    @GetMapping("/recharge/get")
    public List<Recharge> find(){
        return rechargeMapper.selectList(null);
    }


}
