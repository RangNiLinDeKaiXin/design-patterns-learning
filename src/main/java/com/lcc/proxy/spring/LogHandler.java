package com.lcc.proxy.spring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;

/**
 * @author: lcc
 * @Date: 2018-07-02
 **/
@Getter
@Setter
@AllArgsConstructor
public class LogHandler implements InvocationHandler {
	private Object target;

	@Override
	public void invoke(Object o, Method m) {
		System.out.println("开始执行");
		try {
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println("结束执行");
	}
}