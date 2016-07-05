package com.jeefw.controller.sys;

import com.jeefw.core.JavaEEFrameworkBaseController;
import com.jeefw.model.sys.Attachment;
import com.jeefw.service.sys.AttachmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 附件的控制层
 */
@Controller
@RequestMapping("/sys/attachment")
public class AttachmentController extends JavaEEFrameworkBaseController<Attachment> {

    @Resource
    private AttachmentService attachmentService;

}
