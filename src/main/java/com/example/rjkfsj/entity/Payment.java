package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Type;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
@ToString
@TableName("bought")
public class Payment {
    @TableId(type = IdType.AUTO)
    private int id;
    private Date date;
    private String intro;
    private int num;
    //单价
    private double allprice;
    //店铺名称
    private int shopid;
    private int buycondition;
    private int peopleid;
    @TableField(exist = false)
    private List<Shop> shops;
}
