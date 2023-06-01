package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Payment;
import com.example.rjkfsj.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@CrossOrigin
@RestController
public class PaymentController {
    @Autowired
    private PaymentMapper paymentMapper;

    @PostMapping("/payment/{peopleid}")
    public List<Payment> pament(@PathVariable int peopleid){
        return paymentMapper.findboughtbypeople(peopleid);
    }

}
