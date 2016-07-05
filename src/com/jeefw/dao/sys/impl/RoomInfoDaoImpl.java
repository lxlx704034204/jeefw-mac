package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.RoomInfoDao;
import com.jeefw.model.sys.RoomInfo;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

@Repository
public class RoomInfoDaoImpl extends BaseDao<RoomInfo> implements RoomInfoDao {

    public RoomInfoDaoImpl() {
        super(RoomInfo.class);
        // TODO Auto-generated constructor stub
    }

}
