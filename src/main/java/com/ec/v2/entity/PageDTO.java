package com.ec.v2.entity;

public class PageDTO {
    private Integer pageSize = 200;
    private Integer pageNo = 1;
    private Long total = 0L;
    private Integer totalPage = 0;

    public PageDTO() {
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        if (pageSize > 200) {
            this.pageSize = 200;
        } else if (pageSize > 0) {
            this.pageSize = pageSize;
        } else {
            this.pageSize = 200;
        }

    }

    public Integer getMaxPageNo() {
        if (this.total % this.pageSize == 0) {
            this.totalPage = this.total.intValue() / this.pageSize;
        } else {
            this.totalPage = this.total.intValue() / this.pageSize + 1;
        }

        return this.totalPage;
    }

    public Integer getPageNo() {
        if (null == this.pageNo || this.pageNo <= 0) {
            this.pageNo = 1;
        }

        return this.pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
        if (total % this.pageSize == 0) {
            this.totalPage = total.intValue() / this.pageSize;
        } else {
            this.totalPage = total.intValue() / this.pageSize + 1;
        }

    }
}