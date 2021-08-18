package com.yash.inheritance_polymorphism;

public class DogTest {

	public static void main(String[] args) {
		
		Yorkshire y = new Yorkshire("yorkshire","brown");
		Labrador l = new Labrador("labrador", "black");
		
		y.avgBreedWeight();
		y.speak();
		

	}

}
