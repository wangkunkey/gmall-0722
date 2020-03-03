package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SkuLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface SkuLadderService extends IService<SkuLadder> {

    PageVo queryPage(QueryCondition params);
}

