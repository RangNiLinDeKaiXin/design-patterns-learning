package com.lcc.observer;

/**
 * @author: lcc
 * @Date: 2018-06-06
 **/
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}
}