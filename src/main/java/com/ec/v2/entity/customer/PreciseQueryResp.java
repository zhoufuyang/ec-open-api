package com.ec.v2.entity.customer;

import java.util.ArrayList;
import java.util.List;
import com.ec.v2.entity.BaseResp;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class PreciseQueryResp extends BaseResp {
	private List<CustomerInfoItem> data = new ArrayList<>();
}
