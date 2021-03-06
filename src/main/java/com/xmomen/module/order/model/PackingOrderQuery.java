package com.xmomen.module.order.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Jeng on 2016/5/21.
 */
public @Data
class PackingOrderQuery implements Serializable {

    private Integer orderId;
    private Integer orderItemId;
    private String keyword;

}
