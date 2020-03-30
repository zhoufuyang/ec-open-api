package com.ec.v2.entity.customer;


import java.util.List;
import com.ec.v2.entity.PageDTO;
import lombok.Data;

@Data
public class CustomerInfoPageItem {
	private List<CustomerInfoItem> customerInfoList;
	private PageDTO pageInfo;
}
