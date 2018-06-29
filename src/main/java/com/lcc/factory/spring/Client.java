package com.lcc.factory.spring;

/**
 * @author: lcc
 * @Date: 2018-06-29
 **/
public class Client {
	public static void main(String[] args) throws Exception {
		//spring 初始化加载配置文件
		BeanFactory xmlBeanFactory = new XMLBeanFactory("/src/main/java/com/lcc/factory/spring/spring.properties");
		// 读取注解 bean的名字 从中取需要的bean
		Object bean = xmlBeanFactory.getBean("vehicle");
		//根据注解可知道bean 的类型
		Moveable m = (Moveable) bean;
		m.run();
	}
}
