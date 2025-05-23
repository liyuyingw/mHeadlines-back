package com.atguigu.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.Data;

/**
 * @TableName news_headline
 */
//@TableName(value ="news_headline") 配置文件中配置了
@Data
public class Headline {
    @TableId
    private Integer hid;

    private String title;

    private String article;

    private Integer type;

    private Integer publisher;

    private Integer pageViews;

    private Date createTime;

    private Date updateTime;

    @Version
    private Integer version;

    private Integer isDeleted;
}