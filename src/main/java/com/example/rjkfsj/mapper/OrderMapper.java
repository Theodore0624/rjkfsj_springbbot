package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Order;
import com.example.rjkfsj.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
    @Select("select * from orders where uid=#{uid}")
    List<Order> selectByuid(int uid);

    @Select("select id,time,total,uid from orders")
    List<Order> selectall();

    @Select("select * from orders")
    @Results(   //从数据库里查询 并按照下方顺序赋值
            {
                    @Result(column = "id",property = "id"),     //前面是表 后面是类
                    @Result(column = "time",property = "time"),
                    @Result(column = "total",property = "total"),
                    @Result(column = "uid",property = "user",javaType = User.class,     //根据id查order表
                            one = @One(select = "com.example.rjkfsj.mapper.UserMapper.selectById"))

            })

    List<Order> selectAllOrderandUser();
}
