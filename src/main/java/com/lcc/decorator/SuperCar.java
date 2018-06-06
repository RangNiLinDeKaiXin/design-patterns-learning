package com.lcc.decorator;

/**
 * Decorator：装饰抽象类
 *
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class SuperCar implements ICar {
	protected ICar car;//持有一个真实对象的引用

	@Override
	public void move() {
		car.move();//这里调用真实对象的移动方法
	}

	//构造的时候传参
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
}
