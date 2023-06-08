package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Shop;
import com.example.rjkfsj.mapper.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ShopController {
    @Autowired
    private ShopMapper shopMapper;

    @GetMapping("/shop/get")
    public List<Shop> shopget(){
        return shopMapper.selall();
    }

    @RequestMapping(value = "/shop/changelev",method = RequestMethod.POST)
    public Shop change(@RequestBody(required = true)Shop shop){
        int shopid = shop.getShopid();
        int level = shop.getShoplevel();
        return shopMapper.changelev(level,shopid);
    }
}
