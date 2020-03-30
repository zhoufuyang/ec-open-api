package com.ec.v2.entity.customer.change;

import java.util.ArrayList;
import java.util.List;

import com.ec.v2.entity.BaseResp;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper=true)
public class ChangeResp extends BaseResp {
	private List<ChangeRespItem> data = new ArrayList<>();
}
