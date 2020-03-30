package com.ec.v2.entity.customer;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TrajectoryPageItem {
     private List<TrajectoryItem> trajectoryList = new ArrayList<>();
     private TrajectoryNextPageDTO nextPageDTO = new TrajectoryNextPageDTO();
}
