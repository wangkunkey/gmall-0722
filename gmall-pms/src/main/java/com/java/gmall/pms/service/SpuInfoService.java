package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SpuInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu信息
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo queryPage(QueryCondition params);
}

