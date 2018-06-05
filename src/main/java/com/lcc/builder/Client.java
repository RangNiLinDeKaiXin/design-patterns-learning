package com.lcc.builder;

/**
 * @author: lcc
 * @Date: 2018-06-05
 **/
public class Client {
	public static void main(String[] args) {
		//具体使用的时候，只需要知道构建接口、组装接口和一个飞船对象，我们根本不需要知道内部怎么组装的，内部有多少零件。
		//只需要知道怎么使用组装即可。
		AirShipDirector shipDirector = new FzAirShipDirector(new FzAirShipBuilder());
		//构建对象
		AirShip airShip = shipDirector.directorAirShip();

		System.out.println(airShip.getEngine());
	}
}
