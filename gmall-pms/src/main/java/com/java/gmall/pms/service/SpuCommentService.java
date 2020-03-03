package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SpuComment;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品评价
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface SpuCommentService extends IService<SpuComment> {

    PageVo queryPage(QueryCondition params);
}

