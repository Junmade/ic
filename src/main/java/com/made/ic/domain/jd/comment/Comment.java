package com.made.ic.domain.jd.comment;

/**
 * @ClassName: Comment
 * @Description: 评价详情
 * @Author: Made
 * @Date: 2019/bootstrap-3.3.7/21
 */
public class Comment {

    /**
     "id": 12934793825,
     "topped": 0,
     "guid": "2b646ce1-d127-4287-9232-43e3f3ca196e",
     "content": "宝贝收到了，第一次用小米，感觉不错，很顺手，小米系统很酷，照相效果感觉很清晰，机子运行快，吃鸡没问题，充电很快，有一小时过些就满了，不过处理器高，机子确实很费电，如果电池再大点就更好了，给赞！！！",
     "creationTime": "2019-06-23 13:05:12",
     "isTop": false,
     "referenceId": "100000400010",
     "referenceImage": "jfs/t1/24714/24/8640/124174/5c77ab53E9e515e2e/8b1aa5d1fc7a5e23.jpg",
     "referenceName": "小米8屏幕指纹版 6GB+128GB 黑色 全网通4G 双卡双待 全面屏拍照智能游戏手机",
     "referenceTime": "2019-06-18 00:09:56",
     "referenceType": "Product",
     "referenceTypeId": 0,
     "firstCategory": 9987,
     "secondCategory": 653,
     "thirdCategory": 655,

     "userImage": "misc.360buyimg.com/user/myjd-2015/css/i/peisong.jpg",
     "userImageUrl": "misc.360buyimg.com/user/myjd-2015/css/i/peisong.jpg",
     "userLevelId": "56",
     "userProvince": "",
     "viewCount": 0,
     "orderId": 0,
     "isReplyGrade": false,
     "nickname": "jd_177933eqk",


     "images": [{
     "id": 875700530,
     "associateId": 563067440,
     "productId": 0,
     "imgUrl": "//img30.360buyimg.com/n0/s128x96_jfs/t1/39555/22/9592/117652/5d0f0888Ea96cd665/fbe731c2185f51f6.jpg",
     "available": 1,
     "pin": "",
     "dealt": 0,
     "imgTitle": "",
     "isMain": 0,
     "jShow": 0
     }]


     "videos": [{
     "id": 875700532,
     "associateId": 563067440,
     "productId": 100000400010,
     "videoTitle": "",
     "remark": "https://vod.300hu.com/4c1f7a6atransbjngwcloud1oss/6d3301c4195162222912614401/v.f30.mp4?dockingId=51a05cee-1913-49fd-94a1-af9075281961&storageSource=3",
     "yn": 0,
     "dealt": 0,
     "isMain": 0,
     "videoLength": bootstrap-3.3.7,
     "pin": "",
     "videoUrl": "98521808",
     "mainUrl": "https://img.300hu.com/4c1f7a6atransbjngwcloud1oss/6d3301c4195162222912614401/imageSampleSnapshot/1561266305_827598623.100_791.jpg",
     "available": 1,
     "videoWidth": 586,
     "videoHeight": 1280,
     "jShow": 0
     }]

     */

    private String id;

    /**
     *  评价内容
     */
    private String content;

    /**
     * 创建时间
     */
    private String creationTime;


    private String referenceId;

    /**
     * 评价人头像
     */
    private String userImage;
    private String userImageUrl;
    /**
     * 评价人名称
     */
    private String nickname;

    /**
     * 购买商品颜色
     */
    private String productColor;


    /**
     * 购买商品型号
     * "6GB+128GB",
     */
    private String productSize;
}
