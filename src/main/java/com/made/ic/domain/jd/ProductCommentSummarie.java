package com.made.ic.domain.jd;

/**
 * @ClassName: ProductCommentSummarie
 * @Description: 商品评论摘要   -- 弃用
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/21
 */
public class ProductCommentSummarie {

    //  -- 弃用
    // https://club.jd.com/comment/productCommentSummaries.action?referenceIds=100000400010&callback=jQuery8815716&_=1563703707854


    /**
     * 商品ID
     */
    private String SkuId;

    /**
     * 商品ID
     */
    private String ProductId;


    private String ShowCount;

    private String ShowCountStr;

    /**
     * 全部评价(130万+)
     */
    private String CommentCountStr;
    private String CommentCount;

    private String AverageScore;

    private String DefaultGoodCountStr;
    private String DefaultGoodCount;

    /**
     * 好评
     */
    private String GoodCountStr;
    private String GoodCount;

    /**
     * 追评
     */
    private String AfterCount;
    private String AfterCountStr;

    private String OneYear;

    /**
     * 视频晒单
     */
    private String VideoCount;
    private String VideoCountStr;

    /**
     * 好评度
     */
    private String GoodRate;
    private String GoodRateShow;
    private String GoodRateStyle;

    /**
     * 中评
     */
    private String GeneralCountStr;
    private String GeneralCount;

    private String GeneralRate;
    private String GeneralRateShow;
    private String GeneralRateStyle;

    /**
     * 差评
     */
    private String PoorCountStr;
    private String PoorCount;

    private String PoorRate;
    private String PoorRateShow;
    private String PoorRateStyle;


    private String SensitiveBook;



}
