package com.atguigu.service;

import com.atguigu.pojo.User;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author LJWen
* @description 针对表【news_user】的数据库操作Service
* @createDate 2025-03-30 17:48:18
*/
public interface UserService extends IService<User> {

    /**
     * 登录功能实现
     * @param user
     * @return
     */
    Result login(User user);

    /**
     * 根据token获取用户数据
     * @param token
     * @return
     */
    Result getUserInfo(String token);

    /**
     * 注册用户名检查
     * @param username
     * @return
     */
    Result checkUserName(String username);

    /**
     * 注册功能实现
     * @param user
     * @return
     */
    Result regist(User user);
}
