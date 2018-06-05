package com.lcc.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 构建一个宇宙飞船 这个对象很复制 需要许多东西
 *
 * @author: lcc
 * @Date: 2018-06-05
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirShip {
	private OrbitalModule orbitalModule;//轨道舱
	private Engine engine;//发动机
	private EscapeTower escapeTower;//逃逸塔

}

//轨道舱
@Data
@AllArgsConstructor
@NoArgsConstructor
class OrbitalModule {
	private String name;

}

//发动机
@Data
@AllArgsConstructor
@NoArgsConstructor
class Engine {
	private String name;

}

//逃逸塔
@Data
@AllArgsConstructor
@NoArgsConstructor
class EscapeTower {
	private String name;

}