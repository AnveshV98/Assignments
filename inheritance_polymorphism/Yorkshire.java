package com.yash.inheritance_polymorphism;

public class Yorkshire extends Dog{
      String name ="yorkshire";
      String color ="brown";
	 double weight2 = 15.5;
	 double weight1 = 30.5;
	 
	
	public Yorkshire(String string, String string2) {
		System.out.println(name+" "+color);
	}


	@Override
	int avgBreedWeight() {
	
		System.out.println((weight1+weight2)/2);
		return 0;
	}
	
	

}
