package com.ec.v2.entity.customer;

import com.ec.v2.entity.PageVO;
import com.ec.v2.entity.SortBaseVO;
import com.ec.v2.entity.TimeRangeBaseVO;

import lombok.Data;

@Data
public class PageQueryVO {
    /**
     * 电话
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 客户阶段
     */
    private Integer step;
    /**
     * 标签IDs
     */
    private String labelIds;
    /**
     * 跟进人ID
     */
    private Long followUserId;
    /**
     * 公海ID
     */
    private Long publicPondId;
    /**
     * 动态时间
     */
    private TimeRangeBaseVO modifyTime;
    /**
     * 联系时间
     */
    private TimeRangeBaseVO contactTime;
    /**
     * 创建时间
     */
    private TimeRangeBaseVO createTime;
    /**
     * 排序
     */
    private SortBaseVO orderBy;
    /**
     * 分页
     */
    private PageVO pageInfo;
}
