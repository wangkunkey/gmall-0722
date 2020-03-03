package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.AttrAttrgroupRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 属性&属性分组关联
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageVo queryPage(QueryCondition params);
}

