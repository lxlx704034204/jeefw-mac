package com.jeefw.service.sys;

import com.jeefw.model.sys.BuildingInfo;
import core.service.Service;

import java.util.List;

public interface BuildingInfoService extends Service<BuildingInfo> {

    public List CreateHQLQuery(String hql);

}
