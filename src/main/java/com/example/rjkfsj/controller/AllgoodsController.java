package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Allgoods;
import com.example.rjkfsj.mapper.AllgoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@CrossOrigin
public class AllgoodsController {
    @Autowired
    private AllgoodsMapper allgoodsMapper;

    @GetMapping("/allgoods/get")
    public List<Allgoods> find(){
        return allgoodsMapper.selectList(null);
    }

    @PostMapping("/allgoods/getbyid/{id}")
    public Allgoods findbyid(@PathVariable int id){
        System.out.print(id);
        return allgoodsMapper.findbyid(id);
    }

    @GetMapping("/allgoods/up")
    public List<Allgoods> upgood(){return allgoodsMapper.upprice();}


    @GetMapping("/allgoods/down")
    public List<Allgoods> downgood(){return allgoodsMapper.downprice();}

    @GetMapping("/allgoods/people")
    public List<Allgoods> people(){return allgoodsMapper.downpeople();}

    @GetMapping("/allgoods/grade")
    public List<Allgoods> grades(){return allgoodsMapper.grade();}


    @PostMapping("/allgoods/{intro}")
    public List<Allgoods> findname(@PathVariable String intro){return allgoodsMapper.findbyname(intro);}

    @GetMapping("/allgoods/{id}")
    public List<Allgoods> findshopname(@PathVariable int id){
        return allgoodsMapper.findshop(id);
    }

    @GetMapping("/allgoods/get/{goodid}")
    public List<Allgoods> findshopid(@PathVariable int goodid){
        return allgoodsMapper.findbyshopid(goodid);
    }
}
