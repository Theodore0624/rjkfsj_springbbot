package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Payment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

    @Select("select * from bought where peopleid=#{peopleid}")
    @Results({
           @Result(column = "id",property = "id"),
            @Result(column = "date",property = "date"),
            @Result(column = "intro",property = "intro"),
            @Result(column = "num",property = "num"),
            @Result(column = "nowprice",property = "nowprice"),
            @Result(column = "shopid",property = "shopid"),
            @Result(column = "buycondition",property = "buycondition"),
            @Result(column = "peopleid",property = "peopleid"),
            @Result(column = "shopid",property = "shops",javaType = List.class,
                many = @Many(select = "com.example.rjkfsj.mapper.ShopMapper.findshop")),
})
    List<Payment> findboughtbypeople(int peopleid);
}
