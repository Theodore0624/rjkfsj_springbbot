package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Addcar;
import com.example.rjkfsj.entity.Cart;
import com.example.rjkfsj.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class CartController {
    @Autowired
    private CartMapper cartMapper;

    @PostMapping("/cartpost/{peopleid}")
    public List<Cart> postbypeopleid(@PathVariable int peopleid){
        System.out.print("\n"+peopleid);
        return cartMapper.findgoodid(peopleid);
    }


    @RequestMapping(value = "/cartpost/addcar/ups",method = RequestMethod.POST)
    public String postadd(@RequestBody(required = true)Addcar addcar){

    int peopleid = addcar.getPeopleid();
    int goodid = addcar.getGoodid();
    int i = cartMapper.addcar(peopleid,goodid);
    if(i>0){
        return "添加购物车成功";}
    else return "添加购物车失败";
    }

    @PostMapping("/cartpost/del/{goodid}")
    public String deletebys(@PathVariable int goodid){
    int i = cartMapper.deleteby(goodid);
        if(i>0){
            return "删除商品成功";}
        else return "删除商品失败";

    }
}
