package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Comment;
import com.example.rjkfsj.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
    @Select("select * from comment where goodid=#{goodid}")
    List<Comment> getidbygoodid(int goodid);

    @Select("select * from comment where goodid=#{goodid} and gradelevel=#{gradelevel}")
    List<Comment> getlevel(int goodid,int gradelevel);

}
