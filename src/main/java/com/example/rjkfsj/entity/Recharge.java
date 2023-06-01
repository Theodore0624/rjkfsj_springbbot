package com.example.rjkfsj.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

@Data
@TableName("recharge")
public class Recharge {
    @TableId(type = IdType.AUTO)
    private int id;
    private Date date;
    private String approach;
    private int topup;
    private int uid;
}
