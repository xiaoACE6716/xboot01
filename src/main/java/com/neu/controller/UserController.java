package com.neu.controller;

import com.neu.pojo.ResultJson;
import com.neu.pojo.User;
import com.neu.service.UserService;
import com.neu.util.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController  {

    //代码编写处

    @Autowired
    private UserService userService;

    //通过ID查找用户
    @GetMapping(value = "/{id}")
    public ResultJson getUserById(@PathVariable String id){
        User user;
        user = userService.getUserById(id);
        return new ResultJson(user);
    }

    //返回所有用户
    @GetMapping()
    public ResultJson getAllUsers(){
        List<User> allUser = userService.getAllUser();
        return new ResultJson(allUser);
    }

    //新增用户
    @PostMapping()
    public ResultJson insert(
            @RequestParam(value = "userName")String userName,
            @RequestParam(value = "password")String password){

        //如果非空，返回错误
        if (userService.getUserByUserName(userName) != null){
            return new ResultJson(500,"数据操作失败",null);
        }else {
            //为空，可以添加
            User newUser = new User();
            newUser.setId(IDUtil.getID());
            newUser.setUserName(userName);
            newUser.setPassword(password);

            userService.insert(newUser);
            return new ResultJson(null);

        }
    }

    //更新用户接口
    @PutMapping()
    public ResultJson updateUserById(
            @RequestParam(value = "id")String id,
            @RequestParam(value = "userName")String userName,
            @RequestParam(value = "password")String password
    ){

        User updateUser = new User();
        updateUser.setId(id);
        updateUser.setUserName(userName);
        updateUser.setPassword(password);

        int resultInt = userService.updateUserById(updateUser);

        ResultJson resultJson;
        if (resultInt != 0){
            resultJson = new ResultJson(null);
        }else {
            resultJson = new ResultJson(500, "数据操作失败", null);
        }
        return resultJson;
    }

    //删除用户接口
    @DeleteMapping(value = "/{id}")
    public ResultJson deleteUserById(@PathVariable String id){

        User user = userService.getUserById(id);

        int resultInt = userService.deleteUserById(id);
        if (resultInt != 0){
            return new ResultJson(user);
        }else {
            return new ResultJson(500,"数据操作失败",user);
        }
    }

}
