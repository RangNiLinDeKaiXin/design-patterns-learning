package com.lcc.proxy;

/**
 * 代理角色（明星经纪人）
 *
 * @author: lcc
 * @Date: 2018-06-06
 **/
public class ProxyStar implements Star {
	private Star star;//真实对象的引用（明星）


	public void confer() {
		System.out.println("ProxyStar.confer()");
	}


	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}


	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}


	@Override
	public void sing() {
		confer();
		signContract();
		bookTicket();
		star.sing();//真实对象的操作（明星唱歌）
		collectMoney();
	}


	public ProxyStar(Star star) {//通过构造器给真实角色赋值
		this.star = star;
	}
}