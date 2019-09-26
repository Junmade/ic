package com.made.ic.serivce.jd;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.made.ic.domain.jd.Price;
import com.made.ic.domain.jd.Product;
import com.made.ic.util.ResultMessage;
import com.made.ic.vo.jd.PhoneHotSaleVo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @ClassName: PhoneHotSaleServiceImpl
 * @Description: 京东手机热销排行榜
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/19
 */
@Service
public class PhoneHotSaleServiceImpl implements PhoneHotSaleService {

    private static final String HOT_SALE = "https://ch.jd.com/hotsale2?cateid=653&source=pc&callback=top_sale&_=1563523145310";

    private static final String HOT_PHONE_SALE_URL = "https://ch.jd.com/hotsale2?cateid=653";

    private static final String PRICE_URL = "https://p.3.cn/prices/mgets";

    @Value("PHONE_HOT_SALE")
    private String phoneHotSale;

    @Override
    public ResultMessage listPhoneHotSale() {

        System.out.println(phoneHotSale);

        // 获取商品排行榜
        String result = HttpUtil.get(HOT_PHONE_SALE_URL);

        List<Product> products = new ArrayList<>();

        JSONObject jsonObject = JSONUtil.parseObj(result);
        JSONArray jsonProducts = jsonObject.getJSONArray("products");

        products = jsonProducts.toList(Product.class);

        // 获取商品价格
        List<String> wareIds = new ArrayList<>();

        for (Product product : products ) {

            String wareId = product.getWareId();
            wareIds.add(wareId);
        }

        List<Price> prices = this.listPrice(wareIds);


        PhoneHotSaleVo vo = new PhoneHotSaleVo();
        vo.setProducts(products);
        vo.setPrices(prices);


        return ResultMessage.ok(vo);
    }

    @Override
    public List<Price> listPrice(List<String> skuIds) {

        List<Price> prices = new ArrayList<>();

        if (CollectionUtil.isEmpty(skuIds)) {

            // 异常
            return prices;
        }

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("skuIds", skuIds);

        String result = HttpUtil.get(PRICE_URL, paramMap);

        JSONArray jsonArray = JSONUtil.parseArray(result);

        prices = jsonArray.toList(Price.class);

        return prices;
    }


    /**
     * 截取字符串 "(" ")"
     * @param value
     * @return
     */
    private String getSubString(String value) {

        if (StrUtil.isBlank(value)) {

            return value;
        }

        int start = value.indexOf("(") + 1;
        int end = value.lastIndexOf(")");

        return value.substring(start, end);
    }

    public static  void main(String[] args) {


        String  result = "[{\"cbf\":\"0\",\"id\":\"J_100000400010\",\"m\":\"10000.00\",\"op\":\"2999.00\",\"p\":\"1799.00\"},{\"cbf\":\"0\",\"id\":\"J_100000508193\",\"m\":\"9999.00\",\"op\":\"1599.00\",\"p\":\"1399.00\"},{\"cbf\":\"0\",\"id\":\"J_100003717479\",\"m\":\"10000.00\",\"op\":\"2999.00\",\"p\":\"2999.00\"},{\"cbf\":\"0\",\"id\":\"J_100005502442\",\"m\":\"9999.00\",\"op\":\"4999.00\",\"p\":\"4999.00\"}]";

        JSONArray jsonArray = JSONUtil.parseArray(result);

        List<Price> prices = jsonArray.toList(Price.class);

        System.out.println(prices);

    }

}
