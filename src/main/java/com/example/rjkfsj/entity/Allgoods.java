package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

@Data
@TableName("allgoods")
public class Allgoods {
    @TableId(type = IdType.AUTO)
    private int id;
    private String intro;
    private float nowprice;
    private float oldprice;
    private String shop;
    private int inventory;
    private float grade;
    private int buypeople;
    private int shopid;
    private int historynum;
}
