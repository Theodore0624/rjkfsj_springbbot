package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Allgoods;
import com.example.rjkfsj.entity.Cart;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface CartMapper extends BaseMapper<Cart> {
    @Select("select * from cart where peopleid=#{peopleid}")
    @Results(
        {
                @Result(column = "id",property = "id"),
                @Result(column = "peopleid",property = "peopleid"),
                @Result(column = "goodid",property = "goodid"),
                @Result(column = "num",property = "num"),

                @Result(column = "goodid",property = "allgoods",javaType = List.class,
                    many = @Many(select = "com.example.rjkfsj.mapper.AllgoodsMapper.findbyid"))

        }
    )
    List<Cart> findgoodid(int peopleid);

    @Insert("INSERT INTO cart(peopleid,goodid) VALUES(#{peopleid},#{goodid})")
    int addcar(int peopleid,int goodid);

    @Delete("delete from cart where goodid=#{goodid}")
    int deleteby(int goodid);
}
