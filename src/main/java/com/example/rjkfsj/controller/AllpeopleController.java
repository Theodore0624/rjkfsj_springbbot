package com.example.rjkfsj.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.rjkfsj.entity.Allpeople;
import com.example.rjkfsj.mapper.AllpeopleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AllpeopleController {
    @Autowired      //将对象从Usermapper里自动注入
    private AllpeopleMapper allpeopleMapper;



//    @GetMapping("/user/username")
//    public List<Allpeople> finduser(){
//        QueryWrapper<Allpeople> queryWrapper = new QueryWrapper();     //mybatis 数据库方法
//        queryWrapper.eq("username","zhangsan");
//        return userMapper.selectList(queryWrapper);
//    }

//    @GetMapping("/user/page")
//    public IPage separate_page(){
//        Page<Allpeople> page = new Page<>(0,2); //(从哪条开始取,每页取几条)
//        IPage iPage = userMapper.selectPage(page,null);     //null里可以写查询条件
//        return iPage;
//    }





//    @GetMapping("/user")
//    @ApiOperation("获取用户")
//    public List getUserbyId(){    //@PathVariable从路径中获取id
//        List<User> list_get = userMapper.selectList(null);
//        System.out.print(list_get);
//        return list_get;
//    }

//    @PostMapping("/user")
//    public String save(User user){
//        int i = userMapper.insert(user);
//        if (i>0){
//            return "插入成功";
//        }
//        else return "插入失败";
//    }
//
//    @PutMapping("/user/{id}")
//    public String update(User user){
//        return "更新用户";
//    }
//
//    @DeleteMapping("/user")
//    public String deletebyId(@PathVariable int id){
//        System.out.print(id);
//        return "删除用户";
//    }
}
