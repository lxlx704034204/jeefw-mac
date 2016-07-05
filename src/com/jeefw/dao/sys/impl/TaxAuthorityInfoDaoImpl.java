package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.TaxAuthorityInfoDao;
import com.jeefw.model.sys.TaxAuthorityInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class TaxAuthorityInfoDaoImpl extends BaseDao<TaxAuthorityInfo> implements TaxAuthorityInfoDao {

    public TaxAuthorityInfoDaoImpl() {
        super(TaxAuthorityInfo.class);
    }

}
