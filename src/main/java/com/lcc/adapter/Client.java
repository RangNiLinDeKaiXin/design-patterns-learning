package com.lcc.adapter;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {
	//说话
	public void test1(Target t) {
		t.handleReq();
	}

	//NBA中的球员来自不同国家，而世界标准语言是英语。
    // 那他们不会英语，也不能各自学习所有国家的语言。所以，最好的办法就是请不同的翻译
	//	将这些球员国家的语言翻译成英语。而这些翻译就是适配器
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
		//需要传入适配器
		Target t = new Adapte(a);
		c.test1(t);
	}
}
