package com.java.design.patterns;

public abstract class Duck {

	// Behavior Variables are declared as the behavior INTERFACE type
	
	// Each Duck  has a reference something that implements the QuackBehavior interface
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior fb){
		
		flyBehavior=fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb){
		
		quackBehavior=qb;		
	}
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void display();
	
	
	/* Rather than handling the quack behavior itself, the Duck object delegates that behavior to the object
	referenced by quackBehavior */
	
	// Delegates to the behavior class
	
	public void performQuack(){
	
		quackBehavior.quack();
	}
	
	public void performFly(){
		
		flyBehavior.fly();
	}
	
	public void swim(){
		
		System.out.println("All ducks float, even decoys!");
	}
	
}
