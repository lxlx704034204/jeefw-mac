package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.TaxRateInfoDao;
import com.jeefw.model.sys.TaxRateInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class TaxRateInfoDaoImpl extends BaseDao<TaxRateInfo> implements TaxRateInfoDao {

    public TaxRateInfoDaoImpl() {
        super(TaxRateInfo.class);
    }

}
