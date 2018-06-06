package com.lcc.decorator;

/**
 * ConcreteDecorator：就是具体的装饰对象
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class FlayCar extends SuperCar {
	public FlayCar(ICar car) {
		super(car);
	}
	//这里就是新增的功能
	public void flay(){
		System.out.println("---天上飞");
	}
	@Override
	public void move() {
		super.move();
		flay();//在原有移动的基础上，装饰了一个fly的功能
	}
}