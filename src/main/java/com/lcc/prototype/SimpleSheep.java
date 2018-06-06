package com.lcc.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 原型模式:浅克隆
 * Cloneable是一个空接口（标记接口），是一个规范。但是如果要克隆这个类对象的话必须实现Cloneable接口
 * 克隆的对象基本数据类型的变量都会重新创建,但仍然保留了原有对象的引用，值随着改变而改变
 * @author: lcc
 * @Date: 2018-06-05
 **/
@Data
@AllArgsConstructor
@ToString
public class SimpleSheep implements Cloneable{
	private String sname;
	private Date birthday;

	/**
	 * 重写Object对象的clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//直接调用Object对象的clone方法
		Object obj = super.clone();
		return obj;
	}

}
