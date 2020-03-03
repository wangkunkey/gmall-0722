package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SkuBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品sku积分设置
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface SkuBoundsService extends IService<SkuBounds> {

    PageVo queryPage(QueryCondition params);
}

