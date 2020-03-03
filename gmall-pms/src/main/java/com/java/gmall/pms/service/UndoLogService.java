package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.UndoLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}

