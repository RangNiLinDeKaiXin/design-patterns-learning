package com.lcc.proxy.spring;

/**
 * @author: lcc
 * @Date: 2018-07-02
 **/
public class Client {
	public static void main(String[] args) throws Exception {
		Tank tank =new Tank();
		LogHandler logHandler = new LogHandler(tank);
		Moveable m = (Moveable) Proxy.newProxyInstance(Moveable.class,logHandler);
		m.move();
	}
}
