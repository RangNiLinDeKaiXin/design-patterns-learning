package com.lcc.proxy;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {
	public static void main(String[] args) {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.sing();//真实对象的操作（明星唱歌）


	}
}
