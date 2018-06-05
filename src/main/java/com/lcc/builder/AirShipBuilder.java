package com.lcc.builder;

/**
 * 飞船构建者 用来构建AirShipz中组件的接口
 *
 * @author: lcc
 * @Date: 2018-06-05
 **/
public interface AirShipBuilder {
	Engine builderEngine();//构建发动机

	OrbitalModule builderOrbitalModule();//构建轨道舱

	EscapeTower builderEscapeTower();//构建逃逸塔
}
