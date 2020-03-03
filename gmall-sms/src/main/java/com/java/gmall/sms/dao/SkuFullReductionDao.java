package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SkuFullReduction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReduction> {
	
}
