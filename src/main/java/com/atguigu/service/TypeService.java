package com.atguigu.service;

import com.atguigu.pojo.Type;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author LJWen
* @description 针对表【news_type】的数据库操作Service
* @createDate 2025-03-30 17:48:18
*/
public interface TypeService extends IService<Type> {

    /**
     * 查询首页分类
     * @return
     */
    Result findAllTypes();
}
