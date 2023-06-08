package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
@TableName("allpeople")     //如果数据库不叫User的话
public class Allpeople {
    @TableId(type = IdType.AUTO)    //提醒程序id自增
    private int peopleid;
//    @TableField("")     //如果表里不叫username
    private String peoplename;


}
