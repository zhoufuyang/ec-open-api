package com.ec.v2.entity.customer;

import com.ec.v2.entity.BaseResp;

import lombok.Data;

@Data
public class AddCustomerResp extends BaseResp{
  private AddCustomerItem data;
}
