package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Shop;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShopMapper extends BaseMapper<Shop> {

    @Select("select * from shop where shopid=#{shopid}")
    List<Shop> findshop(int shopid);

    @Select("select * from shop")
    @Results({
            @Result(column = "shopid",property = "shopid"),
            @Result(column = "shop",property = "shop"),
            @Result(column = "shoplevel",property = "shoplevel"),
            @Result(column = "shoppeopleid",property = "allpeople",javaType = List.class,
            many = @Many(select = "com.example.rjkfsj.mapper.AllpeopleMapper.selectById"))
    })
    List<Shop> selall();

    @Select("UPDATE shop SET shoplevel =#{shoplevel} where shopid=#{shopid}")
    Shop changelev(int shoplevel,int shopid);


}
