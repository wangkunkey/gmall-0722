package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillSkuNotice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀商品通知订阅
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}

