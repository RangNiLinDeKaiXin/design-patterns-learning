package com.lcc.template;

/**
 * 类实现模板方法：取款
 *
 * @author: lcc
 * @Date: 2018-06-06
 **/
public class DrawMoney extends BankTemplateMethod {
	@Override
	public void transact() {
		System.out.println("我要取款");
	}
}