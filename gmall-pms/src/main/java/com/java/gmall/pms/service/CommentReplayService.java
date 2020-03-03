package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.CommentReplay;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品评价回复关系
 *
 * @author wangkun
 * @since  2020-03-03 18:13:45
 */
public interface CommentReplayService extends IService<CommentReplay> {

    PageVo queryPage(QueryCondition params);
}

