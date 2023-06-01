package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("cart")
public class Cart {
    @TableId(type = IdType.AUTO)
    private int id;
    private int peopleid;
    private int goodid;
    private int num;

    @TableField(exist = false)
    private List<Allgoods> allgoods;
}
