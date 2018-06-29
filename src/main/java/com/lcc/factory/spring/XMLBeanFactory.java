package com.lcc.factory.spring;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 假装是解析xml
 * @author: lcc
 * @Date: 2018-06-29
 **/
public class XMLBeanFactory implements BeanFactory {
	private static Map<String, Object> map = new HashMap<String, Object>();

	public XMLBeanFactory(String filename) throws Exception {
		Properties properties = new Properties();
		//获取文件
		File file = new File(System.getProperty("user.dir").toString() + filename);
		InputStream in = new FileInputStream(file);
		//加载文件
		properties.load(in);
		Set<String> names = properties.stringPropertyNames();
		for (String name : names) {
			String val = properties.getProperty(name);
			Object o = Class.forName(val).newInstance();
			//放入容器中
			map.put(name, o);
		}
	}

	@Override
	public Object getBean(String id) {
		return map.get(id);
	}
}
