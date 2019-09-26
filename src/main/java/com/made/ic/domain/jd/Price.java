package com.made.ic.domain.jd;

import lombok.Data;

/**
 * @ClassName: Price
 * @Description: 京东商品价格
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/21
 */
@Data
public class Price {

    /*
        手机排行榜价格
        J_100000400010 = wareId字段

        https://p.3.cn/prices/mgets?skuIds=J_100000400010,J_100000508193,J_100005603522

     */

    // {"cbf":"0","id":"J_100000400010","m":"10000.00","op":"2999.00","p":"1799.00"}


    private String cbf;

    /**
     * 商品ID
     * Product.wareld
     *
     * J_wareld
     */
    private String id;

    private String m;

    /**
     * 原价
     */
    private String op;

    /**
     * 价格
     */
    private String p;
}
