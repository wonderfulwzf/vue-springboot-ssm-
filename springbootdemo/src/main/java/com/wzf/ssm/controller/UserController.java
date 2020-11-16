package com.wzf.ssm.controller;

import com.wzf.ssm.domain.User;
import com.wzf.ssm.response.CommentReturnType;
import com.wzf.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/11/16,17:50
 */
@RestController("user")
public class UserController extends BaseController{
    public static final String BUSINESS_NAME = "用户";
    @Autowired
    private UserService userservice;
    //增加用户
    @RequestMapping("/adduser")
    @ResponseBody
    public CommentReturnType addUser(@RequestBody User user){
        userservice.addUser(user);
        System.out.println("添加用户");
        return CommentReturnType.create(null);
    }
    //删除用户
    @GetMapping("/deleteuser")
    @ResponseBody
    public CommentReturnType deleteUser(@RequestBody long id ){
        userservice.deleteUser(id);
        System.out.println("删除用户");
        return CommentReturnType.create(null);
    }
    //修改用户
    @RequestMapping("/updateuser")
    @ResponseBody
    public CommentReturnType updateUser(@RequestBody User user){
        userservice.updateUser(user);
        System.out.println("删除用户");
        return CommentReturnType.create(null);
    }
    //查询用户
    @GetMapping("/finduser")
    @ResponseBody
    public CommentReturnType findUser(@RequestParam long id){
        User user = userservice.findUser(id);
        return CommentReturnType.create(user);
    }
    //查询用户
    @GetMapping("/finadalluser")
    @ResponseBody
    public CommentReturnType findAllUser(){
        List<User> userList = new ArrayList<>();
        return CommentReturnType.create(userList);
    }
    //测试控制层
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "helloworld";
    }
}
