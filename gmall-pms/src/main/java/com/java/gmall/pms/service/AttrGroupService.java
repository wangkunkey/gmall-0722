package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.AttrGroup;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性分组
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);
}

