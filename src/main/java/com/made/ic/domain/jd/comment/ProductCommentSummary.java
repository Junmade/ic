package com.made.ic.domain.jd.comment;

/**
 * @ClassName: ProductCommentSummary
 * @Description: 商品评论摘要
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/21
 */
public class ProductCommentSummary {

    //     // https://club.jd.com/comment/productCommentSummaries.action?referenceIds=100000400010&callback=jQuery8815716&_=1563703707854


    /**
     * 商品ID
     */
    private String skuId;

    /**
     * 商品ID
     */
    private String productId;


    private String showCount;

    private String showCountStr;

    /**
     * 全部评价(130万+)
     */
    private String commentCountStr;
    private String commentCount;

    private String averageScore;

    private String defaultGoodCountStr;
    private String defaultGoodCount;

    /**
     * 好评
     */
    private String goodCountStr;
    private String goodCount;

    /**
     * 追评
     */
    private String afterCount;
    private String afterCountStr;

    private String oneYear;

    /**
     * 视频晒单
     */
    private String videoCount;
    private String videoCountStr;

    /**
     * 好评度
     */
    private String goodRate;
    private String goodRateShow;
    private String goodRateStyle;

    /**
     * 中评
     */
    private String generalCountStr;
    private String generalCount;

    private String generalRate;
    private String generalRateShow;
    private String generalRateStyle;

    /**
     * 差评
     */
    private String poorCountStr;
    private String poorCount;

    private String poorRate;
    private String poorRateShow;
    private String poorRateStyle;

   
    private String sensitiveBook;



}
