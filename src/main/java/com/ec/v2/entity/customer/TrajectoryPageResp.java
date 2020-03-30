package com.ec.v2.entity.customer;

import java.util.ArrayList;
import java.util.List;

import com.ec.v2.entity.BaseResp;

import lombok.Data;

@Data
public class TrajectoryPageResp extends BaseResp {
	private TrajectoryPageItem data;
}
