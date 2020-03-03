package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillSession;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动场次
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface SeckillSessionService extends IService<SeckillSession> {

    PageVo queryPage(QueryCondition params);
}

