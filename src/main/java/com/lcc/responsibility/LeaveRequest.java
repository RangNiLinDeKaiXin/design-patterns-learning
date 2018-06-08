package com.lcc.responsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 请假的基本信息
 *
 * @author: lcc
 * @Date: 2018-06-07
 **/
@AllArgsConstructor
@Data
public class LeaveRequest {
	private String empName;//请假人
	private int leaveDays;//请假天数
	private String reason;//请假理由

}
