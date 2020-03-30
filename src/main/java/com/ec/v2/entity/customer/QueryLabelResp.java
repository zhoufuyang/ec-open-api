package com.ec.v2.entity.customer;

import java.util.ArrayList;
import java.util.List;
import com.ec.v2.entity.BaseResp;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class QueryLabelResp extends BaseResp {
	private List<QueryLabelRespItem> data = new ArrayList<>();
}
