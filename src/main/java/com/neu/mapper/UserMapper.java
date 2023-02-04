package com.neu.mapper;

import com.neu.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * user表持久层接口
 * @author Admin
 *
 */
@Mapper
public interface UserMapper {
	
	//代码编写处

    //根据ID查找User
    User getUserById(String id);
    //查找所有用户
    List<User> getAllUser();

    //根据用户名查找用户(用于判断同样的用户名存在了没有)
    User getUserByUserName(String userName);

    //新增用户
    int insert(User user);

    //更新用户
    int updateUserById(User user);

    //删除用户
    int deleteUserById(String id);


}
