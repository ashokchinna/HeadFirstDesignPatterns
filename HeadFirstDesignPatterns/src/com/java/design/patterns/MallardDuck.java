package com.java.design.patterns;

/**
 * 	A MallardDuck uses the Quack Class to handle its quack, so when performQuack() is called, the responsiblity
 * for quack is delegated to the Quack Object and we get a real quack.
 * 
 * 	And it uses FlyWithWings as its FlyBehavior Type
 * 
 * 
 * @author astamilmani
 *
 */

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
		
	}
	
	
	 	public void display(){
	 		System.out.println("I'm a real Mallard ");
	 	}

	 	
	 	public static void main(String[] args) {
			
	 		MallardDuck mallardDuck=new MallardDuck();
	 		
	 		mallardDuck.display();
	 		mallardDuck.flyBehavior.fly();
	 		
	 		Duck mallardDuck1=new MallardDuck();
	 		
	 		mallardDuck1.performQuack();
	 		
		}
}
