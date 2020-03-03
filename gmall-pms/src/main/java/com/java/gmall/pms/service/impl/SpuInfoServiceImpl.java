package com.java.gmall.pms.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;

import com.java.gmall.pms.dao.SpuInfoDao;
import com.java.gmall.pms.entity.SpuInfo;
import com.java.gmall.pms.service.SpuInfoService;

@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfo> implements SpuInfoService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuInfo> page = this.page(
                new Query<SpuInfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}