package com.ec.v2.entity.customer;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class AddCustomerItem {
  
   /**
    * 	创建成功的集合
    */
   private List<AddCustomerSuccessItem> successIdList = new ArrayList<>();
   /**
    * 创建失败的集合
    */
   private List<AddCustomerFailureItem> failureList = new ArrayList<>();
}
