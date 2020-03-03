package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SpuFullReduction;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface SpuFullReductionService extends IService<SpuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

