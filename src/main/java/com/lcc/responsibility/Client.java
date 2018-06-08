package com.lcc.responsibility;

import java.io.IOException;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		//构建各个领导人
		Leader a = new Director("张三");//主任
		Leader b = new Manager("李四");//经理
		//设置各个责任链上的关系
		a.setNextLeader(b);//主任的下一个审批人为经理

		//开始请假
		LeaveRequest request1 = new LeaveRequest("小明", 3, "旅游");
		a.handleRequest(request1);

		LeaveRequest request2 = new LeaveRequest("小王", 7, "旅游");
		a.handleRequest(request2);
	}
}
