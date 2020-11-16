package com.wzf.ssm.service;

import com.wzf.ssm.domain.User;
import com.wzf.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description：
 *
 * @author ：wonderful_wzf
 * @date ：2020/11/16,18:33
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    //增加用户
    public void addUser(User user){
        userMapper.insertSelective(user);
        System.out.println("添加用户");
    }
    //删除用户
    public void deleteUser(long id){
        userMapper.deleteByPrimaryKey(id);
        System.out.println("删除用户");
    }
    //修改用户
    public void updateUser(User user){
        userMapper.updateByPrimaryKey(user);
        System.out.println("删除用户");
    }
    //查询用户
    public User findUser(long id ){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
