package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.MemberPrice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品会员价格
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface MemberPriceService extends IService<MemberPrice> {

    PageVo queryPage(QueryCondition params);
}

