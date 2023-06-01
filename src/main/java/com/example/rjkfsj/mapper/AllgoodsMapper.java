package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Allgoods;
import com.example.rjkfsj.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AllgoodsMapper extends BaseMapper<Allgoods> {
    @Select("select * from allgoods where id=#{id} ")
    Allgoods findbyid(int id);

    @Select("select * from allgoods order by nowprice ASC")
    List<Allgoods> upprice();

    @Select("select * from allgoods where intro=#{intro}")
    List<Allgoods> findbyname(String intro );
}
