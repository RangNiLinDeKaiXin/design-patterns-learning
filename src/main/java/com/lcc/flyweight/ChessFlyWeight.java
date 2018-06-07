package com.lcc.flyweight;

/**
 * 享元类接口：可以共享的有颜色，大小，形状
 * @description: 抽象享元类
 * @author: lcc
 * @Date: 2018-06-06
 **/
public interface ChessFlyWeight {
	//这里只设置一个颜色,大小和形状省略
	void setColor(String c);
	String getColor();
	void display(Coordinate c);//显示棋子
}
