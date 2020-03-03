package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {
	
}
