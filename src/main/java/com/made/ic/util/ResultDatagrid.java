package com.made.ic.util;

import lombok.Data;

import java.util.List;

/**
 * @ClassName: ResultDatagrid
 * @Description: 用于返回前端页面数据
 * @Author: Made
 * @Date: 2019/7/24
 */
@Data
public class ResultDatagrid<T> {

    private long total;

    private List<T> rows;
}
