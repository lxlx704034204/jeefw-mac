package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.RoomUseInfoDao;
import com.jeefw.model.sys.RoomUseInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class RoomUseInfoDaoImpl extends BaseDao<RoomUseInfo> implements RoomUseInfoDao {

    public RoomUseInfoDaoImpl() {
        super(RoomUseInfo.class);
    }

}
