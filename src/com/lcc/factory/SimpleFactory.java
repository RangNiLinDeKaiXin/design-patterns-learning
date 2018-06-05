package com.lcc.factory;

/**
 * 简单工厂
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class SimpleFactory {
	public static void main(String[] args) {
		SimpleSendFactory factory = new SimpleSendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}

}

class SimpleSendFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}


