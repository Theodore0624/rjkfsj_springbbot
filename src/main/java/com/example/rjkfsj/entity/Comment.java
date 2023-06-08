package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@TableName("comment")
public class Comment {
    @TableId(type = IdType.AUTO)    //提醒程序id自增
    private int id;
    //    @TableField("")     //如果表里不叫username
    private int goodgrade;
    private String commentword;
    private int goodid;
    private int gradelevel;
    private int peopleid;

    @TableField(exist = false)
    private List<Allgoods> allgoods;

}
