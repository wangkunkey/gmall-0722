package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.HomeSubjectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}

