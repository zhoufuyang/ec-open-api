package com.ec.v2.entity.customer;

import lombok.Data;

@Data
public class AddCustomerFailureItem {
   /**
    * 	失败的序号
    */
   private int index;
   /**
    * "失败的原因
    */
 
   private String failureCause;

   public AddCustomerFailureItem(){

   }

   public AddCustomerFailureItem(int index, String failureCause){
      this.index = index;
      this.failureCause = failureCause;
   }
}
