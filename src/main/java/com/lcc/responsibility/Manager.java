package com.lcc.responsibility;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/
public class Manager extends Leader {
	public Manager(String name) {
		super(name);
	}
	/**
	 * 责任链上对象对请求的具体处理
	 */
	@Override
	public void handleRequest(LeaveRequest request) {
		//经理对象：处理大于3天，小于等于10天的假期
		if (request.getLeaveDays()<=10) {
			System.out.println("请假人："+request.getEmpName()+",天数："+request.getLeaveDays()+",理由："+request.getReason());
			System.out.println("审批人：" + this.getName() + " 主任，审批通过！");
		} else {
			if (this.getNextLeader() != null) {//如果有下一个继承者
				//让下一个继承者处理请求
				this.getNextLeader().handleRequest(request);
			}
		}
	}
}