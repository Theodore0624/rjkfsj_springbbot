package com.example.rjkfsj.controller;

import com.example.rjkfsj.entity.Comment;
import com.example.rjkfsj.entity.Postlevel;
import com.example.rjkfsj.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommentController {
    @Autowired
    private CommentMapper commentMappers;
//    private  Postlevel postlevel;
    @PostMapping("/comment/getbygoodid/{goodid}")
    public List<Comment> getbygoodId(@PathVariable int goodid){
        return commentMappers.getidbygoodid(goodid);
    }

    @RequestMapping(value = "/comment/getbygoodidbody",method = RequestMethod.POST)
    public List<Comment> getlevels(@RequestBody(required = true) Postlevel postlevel){
        System.out.print("\n"+postlevel+"6666666666666666666666666666666666666666");
        int goodid = postlevel.getGoodid();
        int gradelevel = postlevel.getGradelevel();
        return commentMappers.getlevel(goodid,gradelevel);
    }

@GetMapping("/comment/getmy/{peopleid}")
    public List<Comment> getpeopleid(@PathVariable int peopleid){
        return commentMappers.getpeople(peopleid);
}
}
