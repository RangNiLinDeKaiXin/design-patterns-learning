package com.lcc.factory;

/**
 * 抽象工厂
 * 抽象工厂模式用来生产不同产品族的全部产品，对于只增加产品某一部分则不适用
 *
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class AbstractFactory {
	public static void main(String[] args) {
		//想要好车
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();//创建高端发动机
		engine.run();
		engine.start();

		//想要差一点的车
		CarFactory factory2 = new LowCarFactory();
		Engine e2 = factory2.createEngine();
		CarFactory.Seat s2 = factory2.createSeat();
		CarFactory.Tyre t2 = factory2.createTyre();
		e2.run();
		e2.start();
		//以后想要中等车的话可以增加相应中等配件的接口
	}
}

/**
 * 发动机接口
 */
interface Engine {
	void run();

	void start();
}

//好的发动机
class LuxuryEngine implements Engine {
	@Override
	public void run() {
		System.out.println("好发动机转的快");
	}

	@Override
	public void start() {
		System.out.println("启动快，自动启停");
	}
}

//差的发动机
class LowEngine implements Engine {
	@Override
	public void run() {
		System.out.println("转的慢");
	}

	@Override
	public void start() {
		System.out.println("启动慢");
	}
}

/**
 * 汽车总工厂，可以创建轮胎，座椅，发动机
 */
interface CarFactory {
	Engine createEngine();//创建发动机

	Seat createSeat();//创建座椅

	Tyre createTyre();//创建轮胎

	interface Seat {
	}

	interface Tyre {
	}
}

/**
 * 高端汽车制造工厂
 */
class LuxuryCarFactory implements CarFactory {
	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

	private class LuxurySeat implements Seat {
	}

	private class LuxuryTyre implements Tyre {
	}
}

/**
 * 低端汽车制造工厂
 */
class LowCarFactory implements CarFactory {
	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

	private class LowSeat implements Seat {
	}

	private class LowTyre implements Tyre {
	}
}