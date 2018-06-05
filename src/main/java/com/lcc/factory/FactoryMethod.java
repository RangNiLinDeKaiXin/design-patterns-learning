package com.lcc.factory;

/**
 * 工厂方法模式
 * 将工厂类调整为工厂接口，需要什么类型的工厂就使用该类实现该工厂，创建相应的产品
 *如果你现在想增加一个功能：发及时信息，则只需做一个实现类，
 *实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class FactoryMethod {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}

interface Provider {
	 Sender produce();
}

class SendSmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}
}

class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}
}