package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;

import java.sql.Date;
import java.util.List;

@Data
@TableName("users")     //如果数据库不叫User的话
public class User {
    @TableId(type = IdType.AUTO)    //提醒程序id自增
    private int id;
//    @TableField("")     //如果表里不叫username
    private String username;
    private String password;
    private Date birthday;



    //描述用户的所有订单
    @TableField(exist = false)  //↓名词在表里不存在
    private List<Order> order;

}
