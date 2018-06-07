package com.lcc.observer;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {
	public static void main(String[] args) {
		Subject sub = new MySubject();
		sub.add(new Observer1());
		sub.add(new Observer2());

		sub.operation();

	}
}
