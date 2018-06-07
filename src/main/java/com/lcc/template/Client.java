package com.lcc.template;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {

	public static void main(String[] args) {

//		去银行办业务，银行给我们提供了一个模板就是：先取号，排对，办理业务（核心部分我们子类完成），给客服人员评分，完毕。
//		这里办理业务是属于子类来完成的，其他的取号，排队，评分则是一个模板。
		BankTemplateMethod template = new DrawMoney();
		template.process();

		//匿名内部类的方式来实现这种模板方法
		BankTemplateMethod template1 = new BankTemplateMethod() {
			//这里使用匿名内部类实现:只需实现具体业务部分，其他部分则使用模板方法定义好的骨架
			@Override
			public void transact() {
				System.out.println("我要存钱");
			}
		};

		template1.process();
	}
}
