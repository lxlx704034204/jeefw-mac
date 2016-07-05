package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.AreaDivideInfoDao;
import com.jeefw.model.sys.AreaDivideInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class AreaDivideInfoDaoImpl extends BaseDao<AreaDivideInfo> implements AreaDivideInfoDao {

    public AreaDivideInfoDaoImpl() {
        super(AreaDivideInfo.class);
    }

}
