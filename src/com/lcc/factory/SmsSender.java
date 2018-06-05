package com.lcc.factory;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender!");
	}
}
