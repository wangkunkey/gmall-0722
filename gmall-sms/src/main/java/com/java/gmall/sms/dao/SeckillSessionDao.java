package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SeckillSession;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSession> {
	
}
