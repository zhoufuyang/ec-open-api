package com.ec.v2.entity.customer;

import lombok.Data;

@Data
public class AddCustomerSuccessItem {
	/**
	 * 成功的序号
	 */
	private int index;
	/**
	 * 成功后的crmId
	 */
	private long crmId;

	public AddCustomerSuccessItem() {

	}

	public AddCustomerSuccessItem(int index, long crmId) {
		this.index = index;
		this.crmId = crmId;
	}
}
