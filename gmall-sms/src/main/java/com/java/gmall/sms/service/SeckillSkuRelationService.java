package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillSkuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动商品关联
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageVo queryPage(QueryCondition params);
}

