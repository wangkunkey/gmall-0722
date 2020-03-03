package com.java.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SpuImages;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * spu图片
 *
 * @author wangkun
 * @since  2020-03-03 18:13:46
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

