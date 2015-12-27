package com.java.design.patterns;

public abstract class Duck {

	// Behavior Variables are declared as the behavior INTERFACE type
	
	// Each Duck  has a reference something that implements the QuackBehavior interface
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	/* Rather than handling the quack behavior itself, the Duck object delegates that behavior to the object
	referenced by quackBehavior */
	
	public void performQuack(){
	
		quackBehavior.quack();
	}
	
}
