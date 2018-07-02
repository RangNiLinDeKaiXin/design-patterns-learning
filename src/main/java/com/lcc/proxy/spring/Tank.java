package com.lcc.proxy.spring;

import java.util.Random;

/**
 * @author: lcc
 * @Date: 2018-07-02
 **/
public class Tank implements Moveable {
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		try {
			Thread.sleep(new Random().nextInt(1000 * 10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();

		System.out.println("执行时间：" + (end - start));
	}
}
