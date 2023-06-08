package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
    @Select("select * from comment where goodid=#{goodid}")
    List<Comment> getidbygoodid(int goodid);

    @Select("select * from comment where goodid=#{goodid} and gradelevel=#{gradelevel}")
    List<Comment> getlevel(int goodid,int gradelevel);

    @Select("select * from comment where peopleid=#{peopleid}")
    @Results(   //从数据库里查询 并按照下方顺序赋值
            {
                    @Result(column = "id",property = "id"),     //前面是表 后面是类
                    @Result(column = "goodgrade",property = "goodgrade"),
                    @Result(column = "commentword",property = "commentword"),
                    @Result(column = "peopleid",property = "peopleid"),
                    @Result(column = "goodid",property = "allgoods",javaType = List.class,     //根据id给order通过selectByuid赋值
                            many = @Many(select = "com.example.rjkfsj.mapper.AllgoodsMapper.findintro"))     //many=@many表示一对多 一个id可以从order中获得多个行
                    //.selectById表示调用OrderMapper的这个方法
            })
    List<Comment> getpeople(int peopleid);
}
