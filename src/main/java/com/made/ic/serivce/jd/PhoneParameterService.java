package com.made.ic.serivce.jd;

import com.made.ic.util.ResultMessage;

/**
 * @ClassName: PhoneParameterService
 * @Description: 手机参数配置、规格详情
 * @Author: Made
 * @Date: 2019/7/31
 */
public interface PhoneParameterService {


    ResultMessage getParameter(String id);
}
