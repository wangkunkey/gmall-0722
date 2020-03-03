package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author wangkun
 * @since  2020-03-03 18:13:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
