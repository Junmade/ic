package com.made.ic.domain.jd.comment;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: ProductCommentSummarie
 * @Description: 商品评论详情
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/21
 */
@Data
public class ProductPageComments {


    /*

    https://sclub.jd.com/comment/productPageComments.action
        ?callback=fetchJSON_comment98vv12241&productId=100000400010&score=3&sortType=5
        &page=0&pageSize=10&isShadowSku=0&fold=1
    —————
    https://sclub.jd.com/comment/productPageComments.action
        ?callback=fetchJSON_comment98vv12241&productId=100000400010&score=0&sortType=5
        &page=0&pageSize=10&isShadowSku=0&fold=1
    */

    /**
     * 评价相关统计信息
     */
    private ProductCommentSummary productCommentSummary;


    /**
     * 热门评论标签统计信息
     */
    private List<HotCommentTagStatistic> hotCommentTagStatistics;

    /**
     * 评论
     */
    private List<Comment> comments;

}
