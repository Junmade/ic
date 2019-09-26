package com.made.ic.domain.jd;

import lombok.Data;

/**
 * @ClassName: Product
 * @Description: 京东热销排行榜Vo
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/19
 */
@Data
public class Product {


    /**
     * 好评数 1600+
     */
    private String GoodCountStr;
    /**
     * 好评率
     */
    private String GoodRate;

    /**
     * 当前排行
     */
    private String currentRank;

    /**
     * 商品热卖指数
     */
    private String hotScore;

    /**
     * 图片路径
     *
     * jfs/t1/15311/16/6377/388816/5c53a7a2Ec6521c3b/0a5f5e008d032291.jpg
     * img10-14
     * https://img13.360buyimg.com/n1/s320x320_jfs/t1/15311/16/6377/388816/5c53a7a2Ec6521c3b/0a5f5e008d032291.jpg
     *
     */
    private String imgPath;

    private String isNew;

    private String jdSale;

    private String lowInDay;

    private String[] promote;

    /**
     * 实时排行上升还是下降 ranking:-3
     */
    private String ranking;

    private String venderId;

    /**
     * 商品 ID 可查看价格
     *
     *
     */
    private String wareId;

    /**
     * 商品名称
     */
    private String wareName;

}
