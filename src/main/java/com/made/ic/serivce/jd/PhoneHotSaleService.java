package com.made.ic.serivce.jd;

import com.made.ic.domain.jd.Price;
import com.made.ic.util.ResultMessage;

import java.util.List;

/**
 * @ClassName: PhoneHotSaleService
 * @Description: 京东手机热销排行榜
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/19
 */
public interface PhoneHotSaleService {


    /**
     * 手机热销榜
     * @return
     */
    public ResultMessage listPhoneHotSale();


    /**
     * 价格
     * @param skuIds 商品ID数组
     * @return
     */
    public List<Price> listPrice(List<String> skuIds);

}
