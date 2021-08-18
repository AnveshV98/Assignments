package com.Oops.java;

import java.util.ArrayList;
import java.util.List;

public class Car {

	public static void main(String[] args) {
		
		
		 List<CarShop> c = new ArrayList<CarShop>();
		 c.add(new CarShop("audi", "Anvesh", 500  ));
		 c.add(new CarShop("tesla", "ravi", 400));
		 c.add(new CarShop("mercedez", "dharmesh", 600));
		 c.add(new CarShop("ferrari", "Aishwary", 1000));
		 
		 System.out.println("Number of cars sold are: " +c.size());
		

	}

}
