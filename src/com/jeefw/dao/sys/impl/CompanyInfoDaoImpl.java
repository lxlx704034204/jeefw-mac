package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.CompanyInfoDao;
import com.jeefw.model.sys.CompanyInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyInfoDaoImpl extends BaseDao<CompanyInfo> implements CompanyInfoDao {

    public CompanyInfoDaoImpl() {
        super(CompanyInfo.class);
        // TODO Auto-generated constructor stub
    }

}
