package com.lcc.factory.spring;

/**
 * @author: lcc
 * @Date: 2018-06-29
 **/
public class Train implements Moveable {
	@Override
	public void run() {
		System.out.println("火车开开开");
	}
}
