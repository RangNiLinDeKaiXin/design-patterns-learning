package com.lcc.Strategy;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/
public class RegisterUser implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("注册用户：打9折");
		return price*0.9;
	}
}
