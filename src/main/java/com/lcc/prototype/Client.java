package com.lcc.prototype;

import java.io.IOException;
import java.util.Date;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		SimpleSheep s1 = new SimpleSheep("simple型羊",new Date());
		SimpleSheep s2 = (SimpleSheep) s1.clone();//克隆一个羊
		System.out.println(s1);
		s1.getBirthday().setTime(34732834827389L);
		System.out.println(s1);
		//克隆羊的信息
		System.out.println(s2);
		System.out.println();
		System.out.println("---------------------------------");

		DeepSheep d1 = new DeepSheep("deep型羊",new Date());
		DeepSheep d2 = (DeepSheep) d1.deepClone();

		System.out.println(d1);
		d1.getBirthday().setTime(34732834827389L);
		System.out.println(d1);
		//克隆羊的信息
		System.out.println(d2);
	}
}
