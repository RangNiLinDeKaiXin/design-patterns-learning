package com.lcc.factory;

/**
 * 多个工厂
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class MultipleFactory {
	public static void main(String[] args) {
		MultipleSendFactory factory = new MultipleSendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}



class MultipleSendFactory {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}