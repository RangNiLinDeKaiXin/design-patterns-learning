package com.lcc.proxy;

/**
 * 真实角色（明星艺人）
 *
 * @author: lcc
 * @Date: 2018-06-06
 **/
public class RealStar implements Star {

	@Override
	public void sing() {
		System.out.println("张学友.sing()");//真实角色的操作：真正的业务逻辑
	}

}
