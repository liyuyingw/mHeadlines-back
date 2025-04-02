package com.atguigu.service.impl;

import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.pojo.Type;
import com.atguigu.service.TypeService;
import com.atguigu.mapper.TypeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author LJWen
* @description 针对表【news_type】的数据库操作Service实现
* @createDate 2025-03-30 17:48:18
*/
@Service
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type>
    implements TypeService{

    @Override
    public Result findAllTypes() {
        List<Type> list = baseMapper.selectList(null);
        return Result.ok(list);
    }
}




