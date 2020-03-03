package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.Brand;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 品牌
 *
 * @author wangkun
 * @since  2020-03-03 18:13:45
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

