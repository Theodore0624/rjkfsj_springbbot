package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Money;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MoneyMapper extends BaseMapper<Money> {
    @Select("UPDATE money SET allmoney = allmoney-#{sub},points = points+#{sub} where peopleid=#{peopleid}")
    Money submoney(double sub,int peopleid);

    @Select("update money set allmoney=allmoney+#{add} where peopleid=(select shop.shoppeopleid from shop where shop.shopid=#{shopid})")
    Money addmoney(double add,int shopid);
}