package com.made.ic.util;

import lombok.Data;

/**
 * @ClassName: ResultMessage
 * @Description: 用于返回前端页面
 * @Author: Made
 * @Date: 2019/7/24
 */
@Data
public class ResultMessage {

    /**
     * 状态码
     */
    private Integer status;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private Object data;


    public static ResultMessage ok() {

        return new ResultMessage(null);
    }

    public static ResultMessage ok(Object data) {

        return new ResultMessage(data);
    }

    public ResultMessage build(Integer status, String message) {

        return new ResultMessage(status, message, null);
    }

    public static ResultMessage build(Integer status, String message, Object data) {

        return new ResultMessage(status, message, data);
    }


    public ResultMessage(Object data) {

        this.data = data;
        this.status = 200;
        this.message = "OK";
    }

    public ResultMessage(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

}
