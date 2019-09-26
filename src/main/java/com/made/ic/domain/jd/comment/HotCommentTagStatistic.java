package com.made.ic.domain.jd.comment;

import lombok.Data;

/**
 * @ClassName: HotCommentTagStatistic
 * @Description: 热门评论标签统计信息
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/21
 */
@Data
public class HotCommentTagStatistic {

    // "id": "2b480964d06f7f9c",
    //        "name": "流畅至极",
    //        "rid": "2b480964d06f7f9c",
    //        "count": 461,
    //        "type": 4,
    //        "canBeFiltered": true,
    //        "stand": 1,
    //        "ckeKeyWordBury": "eid=104^^tagid=2b480964d06f7f9c^^pid=20001^^sku=100000400010^^sversion=1000^^token=cace2b3198eadecc",
    //        "flag": "false"


    private String id;

    /**
     * 标签
     */
    private String name;

    private String rid;

    /**
     * 数量
     */
    private String count;

    private String type;

    private String canBeFiltered;

    private String stand;

    private String ckeKeyWordBury;

    private String flag;
}
