package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SkuSaleAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku销售属性&值
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValue> {

    PageVo queryPage(QueryCondition params);
}

