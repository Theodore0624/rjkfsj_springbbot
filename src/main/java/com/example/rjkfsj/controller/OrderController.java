package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Order;
import com.example.rjkfsj.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMappers;

    @GetMapping("/order/findAll")
    public List find(){     //因为一个uid对应一个id 就不用List了
        return orderMappers.selectAllOrderandUser();

    }

    @GetMapping("/order/find")
    public List<Order> findorder(){     //因为一个uid对应一个id 就不用List了
        return orderMappers.selectall();

    }
}
