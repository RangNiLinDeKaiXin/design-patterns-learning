package com.lcc.observer;

/**
 * @author: lcc
 * @Date: 2018-06-06
 **/
public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!");
	}
}
