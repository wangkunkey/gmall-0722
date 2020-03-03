package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SkuInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * sku信息
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface SkuInfoService extends IService<SkuInfo> {

    PageVo queryPage(QueryCondition params);
}

