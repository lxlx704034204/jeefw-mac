package com.jeefw.service.sys;

import com.jeefw.model.sys.Attachment;
import core.service.Service;

import java.util.List;

/**
 * 附件的业务逻辑层的接口
 */
public interface AttachmentService extends Service<Attachment> {

    List<Object[]> queryFlowerList(String epcId);

    void deleteAttachmentByForestryTypeId(Long umTypeId);

    List<Object[]> querySensorList();

}
