package com.made.ic.controller.jd;

import com.made.ic.domain.jd.Price;
import com.made.ic.serivce.jd.PhoneHotSaleService;
import com.made.ic.util.ResultMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: PhoneHotSaleController
 * @Description: 京东手机热销排行榜
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/19
 */
@RestController
public class PhoneHotSaleController {

    @Autowired
    private PhoneHotSaleService service;

    /**
     * 查询热销榜
     * @return
     */
    @RequestMapping("select")
    public ResultMessage selectHotSale() {

        return service.listPhoneHotSale();
    }

    /**
     * 查询价格
     * @param skuIds
     * @return
     */
    @RequestMapping("selectPrice")
    public List<Price> selectPrice(List<String> skuIds) {

        return service.listPrice(skuIds);
    }

    /**
     * 查询评论
     */
    @RequestMapping("selectCommont")
    public void selectCommont(){

    }
}
