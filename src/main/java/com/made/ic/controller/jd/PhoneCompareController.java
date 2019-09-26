package com.made.ic.controller.jd;

import com.made.ic.serivce.jd.PhoneCompareService;
import com.made.ic.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PhoneCompareController
 * @Description: 手机比较功能
 * @Author: Made
 * @Date: 2019/7/30
 */
@RestController
public class PhoneCompareController {

    @Autowired
    private PhoneCompareService service;


    @RequestMapping("compare")
    public ResultMessage phoneCompare() {

        return service.phoneCompare();
    }
}
