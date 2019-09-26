package com.made.ic.controller.jd;

import cn.hutool.Hutool;
import cn.hutool.json.JSONUtil;
import com.made.ic.serivce.jd.PhoneParameterService;
import com.made.ic.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: PhoneParametersController
 * @Description: 手机参数配置、规格详情等
 * @Author: Made
 * @Date: 2019/7/31
 */
@RestController
@RequestMapping("phoneParameter")
public class PhoneParameterController {

    @Autowired
    private PhoneParameterService service;


    @RequestMapping("getParameter")
    public ResultMessage getParameter(String wareId) {

        return service.getParameter(wareId);
    }
}
