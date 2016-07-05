package com.jeefw.service.sys.impl;

import com.jeefw.dao.sys.CertificateTypeInfoDao;
import com.jeefw.model.sys.CertificateTypeInfo;
import com.jeefw.service.sys.CertificateTypeInfoService;
import core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CertificateTypeInfoServiceImpl extends BaseService<CertificateTypeInfo> implements CertificateTypeInfoService {

    private CertificateTypeInfoDao certificateTypeInfoDao;

    public CertificateTypeInfoDao getCertificateTypeInfoDao() {
        return certificateTypeInfoDao;
    }

    @Resource
    public void setCertificateTypeInfoDao(CertificateTypeInfoDao certificateTypeInfoDao) {
        this.certificateTypeInfoDao = certificateTypeInfoDao;
        this.dao = certificateTypeInfoDao;
    }


}
