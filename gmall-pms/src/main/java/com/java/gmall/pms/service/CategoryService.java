package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.Category;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品三级分类
 *
 * @author wangkun
 * @since  2020-03-03 18:13:45
 */
public interface CategoryService extends IService<Category> {

    PageVo queryPage(QueryCondition params);
}

