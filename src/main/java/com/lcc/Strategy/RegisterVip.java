package com.lcc.Strategy;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/
public class RegisterVip implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("普通会员：打8折");
		return price*0.8;
	}
}
