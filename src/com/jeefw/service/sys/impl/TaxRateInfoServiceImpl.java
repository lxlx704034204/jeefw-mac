package com.jeefw.service.sys.impl;

import com.jeefw.dao.sys.TaxRateInfoDao;
import com.jeefw.model.sys.TaxRateInfo;
import com.jeefw.service.sys.TaxRateInfoService;
import core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaxRateInfoServiceImpl extends BaseService<TaxRateInfo> implements TaxRateInfoService {

    private TaxRateInfoDao taxRateInfoDao;

    public TaxRateInfoDao getTaxRateInfoDao() {
        return taxRateInfoDao;
    }

    @Resource
    public void setTaxRateInfoDao(TaxRateInfoDao taxRateInfoDao) {
        this.taxRateInfoDao = taxRateInfoDao;
        this.dao = taxRateInfoDao;
    }
}
