package com.lcc.proxy.spring;

import java.lang.reflect.Method;

/**
 * 方法调用处理器
 * @author: lcc
 * @Date: 2018-07-02
 **/
public interface InvocationHandler {
	void invoke(Object o,Method m);
}
