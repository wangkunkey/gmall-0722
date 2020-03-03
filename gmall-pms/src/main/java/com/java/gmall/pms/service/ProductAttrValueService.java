package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.ProductAttrValue;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu属性值
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface ProductAttrValueService extends IService<ProductAttrValue> {

    PageVo queryPage(QueryCondition params);
}

