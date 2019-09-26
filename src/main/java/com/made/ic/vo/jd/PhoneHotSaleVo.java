package com.made.ic.vo.jd;

import com.made.ic.domain.jd.Price;
import com.made.ic.domain.jd.Product;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: PhoneHotSaleVo
 * @Description: 手机排行榜页面数据
 * @Author: Made
 * @Date: 2019/7/25
 */
@Data
public class PhoneHotSaleVo {


    /**
     * 商品
     */
    List<Product> products;

    /**
     * 价格
     */
    List<Price> prices;


}
