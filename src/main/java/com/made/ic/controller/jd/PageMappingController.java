package com.made.ic.controller.jd;

import com.made.ic.util.ResultMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: PageMappingController
 * @Description: 映射页面
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/19
 */
@Controller
public class PageMappingController {

    /**
     * 手机排行榜
     * @return
     */
    @RequestMapping("phoneHotSale")
    public String  hotSale(){

        return "jd/phoneHotSale";
    }

    /**
     * 手机比较
     * @return
     */
    @RequestMapping("phoneCompare")
    public String  phoneCompare(){

        return "jd/phoneCompare";
    }

    /**
     * 手机参数
     * @return
     */
    @RequestMapping("phoneParameter")
    public ModelAndView phoneParameter(String wareId) {

        ModelAndView mav = new ModelAndView();

        mav.addObject("wareId", wareId);
        mav.setViewName("jd/phoneParameter");

        return mav;
    }

    @RequestMapping("index")
    public String index() {


        return "index";
    }

}
