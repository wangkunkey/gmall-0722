package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
