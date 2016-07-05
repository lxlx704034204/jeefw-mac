package com.app.logic;

import com.app.bean.BaseResponseBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * APP接口的协议传输接口
 */
public interface ITransmission {

    public String resv(HttpServletRequest request);

    public void resp(HttpServletResponse response, BaseResponseBean brb);

}
