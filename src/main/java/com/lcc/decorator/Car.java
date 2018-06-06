package com.lcc.decorator;

/**
 * ConcreteComponent：具体的对象
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Car implements ICar{
	@Override
	public void move() {
		System.out.println("汽车移动");
	}
}
