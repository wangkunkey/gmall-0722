package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.Attr;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品属性
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface AttrService extends IService<Attr> {

    PageVo queryPage(QueryCondition params);
}

