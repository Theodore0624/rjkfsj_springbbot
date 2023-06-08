package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Allgoods;
import com.example.rjkfsj.entity.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AllgoodsMapper extends BaseMapper<Allgoods> {
    @Select("select * from allgoods where id=#{id} ")
    Allgoods findbyid(int id);

    @Select("select * from allgoods order by nowprice ASC")
    List<Allgoods> upprice();

    @Select("select * from allgoods order by nowprice desc")
    List<Allgoods> downprice();

    @Select("select * from allgoods order by buypeople desc")
    List<Allgoods> downpeople();

    @Select("select * from allgoods order by grade desc")
    List<Allgoods> grade();

    @Select("select * from allgoods where intro=#{intro}")
    List<Allgoods> findbyname(String intro );

    @Select("select intro from allgoods where id=#{id}")
    List<Allgoods> findintro(int id);

    @Select("select * from allgoods where id=#{id} ")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "shopid",property = "shops",javaType = List.class,
            many = @Many(select = "com.example.rjkfsj.mapper.ShopMapper.findshop"))
    })
    List<Allgoods> findshop(int id);

    @Select("select * from allgoods where shopid=(select shopid from allgoods where id =#{id})")
    List<Allgoods> findbyshopid(int id);
}
