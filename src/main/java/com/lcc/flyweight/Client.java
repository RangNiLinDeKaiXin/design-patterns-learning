package com.lcc.flyweight;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {
	public static void main(String[] args) {
//		FlyweightFactory（享元工厂类）：创建并管理享元对象，享元池一般设计成键值对
//
//		FlyWeight（抽象享元类）：通常是一个接口或者抽象类，声明公共方法，这些方法可以向外界提供对象的内部状态，设置外部状态。
//
//		ConcreteFlyWeight（具体享元类）：为内部状态提供成员变量进行存储
//
//		UnsharedConcreteFlyWeight（非共享享元类）：不能被共享的子类可以设计为非共享享元类
//
//		例如：围棋中的享元模式，在围棋中，所有的白色或黑色的（形状、大小，颜色都一样）只是位置不同，那像这样的情况，可以使用享元模式。

		ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
		// 结果为true，相同或相似对象内存中只存在一份
		System.out.println(chess1 == chess2);

		//使用享元的外部状态
		chess1.display(new Coordinate(10, 10));//黑1在10,10的位置
		chess2.display(new Coordinate(20, 20));//黑2在20,20的位置
		System.out.println(chess1 == chess2);

	}
}
