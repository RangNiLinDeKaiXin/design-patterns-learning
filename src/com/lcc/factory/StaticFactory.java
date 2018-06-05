package com.lcc.factory;

/**
 * 静态工厂
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class StaticFactory {
	public static void main(String[] args) {
		Sender sender = StaticSendFactory.produceMail();
		sender.Send();
	}
}

class StaticSendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}