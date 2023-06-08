package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Shop {
    @TableId(type = IdType.AUTO)
    private int shopid;
    private String shop;
    private int shoppeopleid;
    private int shoplevel;
    @TableField(exist = false)
    private List<Allpeople> allpeople;
}
