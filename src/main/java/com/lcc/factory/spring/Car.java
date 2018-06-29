package com.lcc.factory.spring;

/**
 * @author: lcc
 * @Date: 2018-06-29
 **/
public class Car implements Moveable {
	@Override
	public void run() {
		System.out.println("汽车开开开");
	}
}
