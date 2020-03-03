package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.CouponHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券领取历史记录
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface CouponHistoryService extends IService<CouponHistory> {

    PageVo queryPage(QueryCondition params);
}

