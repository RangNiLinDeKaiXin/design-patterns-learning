package com.lcc.Strategy;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/
public interface Strategy {
	//算法方法:打印商品的价格（不同的实现打不同的折扣）
	 double getPrice(double price);
}
