package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SpuInfoDesc;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu信息介绍
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageVo queryPage(QueryCondition params);
}

