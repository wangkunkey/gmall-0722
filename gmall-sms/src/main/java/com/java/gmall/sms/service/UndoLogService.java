package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.UndoLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 
 *
 * @author wangkun
 * @since  2020-03-03 21:46:54
 */
public interface UndoLogService extends IService<UndoLog> {

    PageVo queryPage(QueryCondition params);
}

