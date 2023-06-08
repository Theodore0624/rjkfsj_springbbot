package com.example.rjkfsj.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rjkfsj.entity.Allpeople;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AllpeopleMapper extends BaseMapper<Allpeople> {
//    @Select("select * from user")
//    public List<User> find();
//
//    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")        //或者insert into user（id,username）单独插1~n项
//    public int insert(User user);   //或者(int id，String username，……)     int insert的int是插入几条对象
//
//    @Update("update user username=#{username},password=#{password},birthday=#{birthday} where id=#{id}")
//    int update(User user);
//
//    @Delete("delete from user where id=#{id}")
//    int delete(User user);

//    @Select("select * from user")
//    List<User> getAll();


    @Select("select * from allpeople where peopleid=#{peopleid}")
    List<Allpeople> selectById(int peopleid);



    //多表查询s
//    @Select("select * from users")
//    @Results(   //从数据库里查询 并按照下方顺序赋值
//            {
//                    @Result(column = "id",property = "id"),     //前面是表 后面是类
//                    @Result(column = "username",property = "username"),
//                    @Result(column = "password",property = "password"),
//                    @Result(column = "birthday",property = "birthday"),
//                    @Result(column = "id",property = "order",javaType = List.class,     //根据id给order通过selectByuid赋值
//                            many = @Many(select = "com.example.rjkfsj.mapper.OrderMapper.selectByuid"))     //many=@many表示一对多 一个id可以从order中获得多个行
//                                                                                                    //.selectById表示调用OrderMapper的这个方法
//            })
//    List<Allpeople> selectAllUserandOrder();
}
