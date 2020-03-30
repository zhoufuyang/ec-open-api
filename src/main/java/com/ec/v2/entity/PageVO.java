package com.ec.v2.entity;

import java.io.Serializable;

public class PageVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer pageSize = 200;
	private Integer pageNo = 1;

	public PageVO() {
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public String toString() {
		return "Page [pageSize=" + this.pageSize + ", pageNo=" + this.pageNo + "]";
	}
}
