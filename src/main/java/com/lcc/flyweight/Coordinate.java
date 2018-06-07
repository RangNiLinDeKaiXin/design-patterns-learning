package com.lcc.flyweight;

/**
 * 坐标类（外部状态）：棋子位置
 * UnsharedConcreteFlyWeight（非共享享元类）：不能被共享的子类可以设计为非共享享元类
 *
 * @author: lcc
 * @Date: 2018-06-06
 **/
public class Coordinate {
	//坐标位置
	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
