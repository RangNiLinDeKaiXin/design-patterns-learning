package com.lcc.Strategy;

/**
 * @author: lcc
 * @Date: 2018-06-07
 **/
public class GeneralUser implements Strategy {
	@Override
	public double getPrice(double price) {
		System.out.println("普通用户，不打折");
		return price;
	}
}