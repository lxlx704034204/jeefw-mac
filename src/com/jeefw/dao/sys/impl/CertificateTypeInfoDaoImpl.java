package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.CertificateTypeInfoDao;
import com.jeefw.model.sys.CertificateTypeInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class CertificateTypeInfoDaoImpl extends BaseDao<CertificateTypeInfo> implements CertificateTypeInfoDao {

    public CertificateTypeInfoDaoImpl() {
        super(CertificateTypeInfo.class);
    }

}
