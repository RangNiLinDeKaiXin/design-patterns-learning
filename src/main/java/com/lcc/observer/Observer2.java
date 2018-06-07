package com.lcc.observer;

/**
* @author: lcc
* @Date: 2018-06-06
**/
public class Observer2 implements Observer {

   @Override
   public void update() {
	   System.out.println("observer2 has received!");
   }

}
