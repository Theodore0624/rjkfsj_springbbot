package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
import java.util.List;
@TableName("orders")
@Data
public class Order {
    @TableId(type = IdType.AUTO)    //提醒程序id自增
    private int id;
    //    @TableField("")     //如果表里不叫username
    private Date time;
    private int total;
    private int uid;

//    @TableField(exist = false)  //↓名词在表里不存在
//    private User user;  //因为一个uid对应一个id 就不用List了

}
