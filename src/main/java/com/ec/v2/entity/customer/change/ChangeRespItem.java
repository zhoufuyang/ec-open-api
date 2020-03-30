package com.ec.v2.entity.customer.change;

import java.util.List;

import lombok.Data;

/**
 * ChangeRespItem
 * 放弃客户 和 修改跟进人 请求模型返回信息
 *
 * @author : BorgXiao@126.com
 * @version : 1.0
 * @date :  2019-12-16 16:19
 **/
@Data
public class ChangeRespItem {
    
    /**
     * 总个数
     */
    private int nums;
    
    /**
     * 失败数
     */
    private int errors;
    
    /**
     * 成功数
     */
    private int success;
    
    /**
     * 详细列表
     */
    private List<ChangeRespItemDetail> list;
}