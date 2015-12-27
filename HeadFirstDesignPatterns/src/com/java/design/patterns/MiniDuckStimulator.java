package com.java.design.patterns;

public class MiniDuckStimulator {
	
	public static void main(String[] args) {
		
		
		/* This calls the MallardDuck's inherited performQuack() method. which then delegates to the 
		 * object's quack behavior(.i.e., calls quack() on the duck's inherited quackBehavior reference)
		 * 
		 *  Same with MallardDuck's inherited performFly() method
		 */
		
		Duck mallard=new MallardDuck();		
		mallard.performFly();		
		mallard.performQuack();
		
		
		Duck model=new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		
		
		
	}

}
