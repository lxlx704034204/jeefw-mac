package com.jeefw.service.sys.impl;

import com.jeefw.dao.sys.TaxAuthorityInfoDao;
import com.jeefw.model.sys.TaxAuthorityInfo;
import com.jeefw.service.sys.TaxAuthorityInfoService;
import core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TaxAuthorityInfoServiceImpl extends BaseService<TaxAuthorityInfo> implements TaxAuthorityInfoService {

    private TaxAuthorityInfoDao taxAuthorityInfoDao;

    public TaxAuthorityInfoDao getTaxAuthorityInfoDao() {
        return taxAuthorityInfoDao;
    }

    @Resource
    public void setTaxAuthorityInfoDao(TaxAuthorityInfoDao taxAuthorityInfoDao) {
        this.taxAuthorityInfoDao = taxAuthorityInfoDao;
        this.dao = taxAuthorityInfoDao;
    }
}
