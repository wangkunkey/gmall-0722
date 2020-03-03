package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.CouponSpuCategoryRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券分类关联
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelation> {

    PageVo queryPage(QueryCondition params);
}

