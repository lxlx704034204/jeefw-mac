package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.BuildingInfoDao;
import com.jeefw.model.sys.BuildingInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class BuildingInfoDaoImpl extends BaseDao<BuildingInfo> implements BuildingInfoDao {

    public BuildingInfoDaoImpl() {
        super(BuildingInfo.class);
    }

}
