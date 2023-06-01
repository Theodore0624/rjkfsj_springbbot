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

    @PostMapping("/allgoods/{intro}")
    public List<Allgoods> findname(@PathVariable String intro){return allgoodsMapper.findbyname(intro);}
}
