package com.atguigu.service;

import com.atguigu.pojo.Headline;
import com.atguigu.pojo.vo.PortalVo;
import com.atguigu.utils.Result;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author LJWen
* @description 针对表【news_headline】的数据库操作Service
* @createDate 2025-03-30 17:48:18
*/
public interface HeadlineService extends IService<Headline> {

    /**
     * 分页查询首页头条信息
     * @param portalVo
     * @return
     */
    Result findNewsPage(PortalVo portalVo);

    /**
     * 查询头条详情
     * @param hid
     * @return
     */
    Result showHeadlineDetail(Integer hid);

    /**
     * 头条发布实现
     * @param headline
     * @return
     */
    Result publish(Headline headline,String token);

    /**
     * 头条修改实现
     * @param headline
     * @return
     */
    Result updateData(Headline headline);
}
