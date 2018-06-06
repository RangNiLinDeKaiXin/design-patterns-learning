package com.lcc.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.Date;

/**
 * 原型模式:深克隆
 * 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的
 * @author: lcc
 * @Date: 2018-06-05
 **/
@Data
@AllArgsConstructor
@ToString
public class DeepSheep implements Cloneable,Serializable {
	private String sname;
	private Date birthday;

	public Object deepClone() throws IOException, ClassNotFoundException {

		//使用序列化和反序列化实现深复制
		//通过ObjectOutputStream流将s1对象读出来给ByteArrayOutputStream流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		//2、将字节数组中的内容反序列化为一个Sheep对象
		//通过ByteArrayInputStream流读入bytes字节数组中数据，然后传给ObjectInputStream对象输入流
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}

}
