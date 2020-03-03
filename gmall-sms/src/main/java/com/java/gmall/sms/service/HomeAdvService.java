package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.HomeAdv;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页轮播广告
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageVo queryPage(QueryCondition params);
}

