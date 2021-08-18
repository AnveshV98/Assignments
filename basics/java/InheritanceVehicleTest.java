package com.yash.basics.java;

public class InheritanceVehicleTest {
	
	  
		void starting(){
			
			System.out.println("strating");
		
		}  
		}  
		class car extends InheritanceVehicleTest{  
		
			void moving(){
			
			System.out.println("car is moving");
			
		}  
		
		}  
		
		class bike extends car{  
		
			void running(){
			
			System.out.println("bike is running");
			}  
		}  
		class TestInheritance2{  
		public static void main(String args[]){  
		
		bike b = new bike();  
		b.starting();  
		b.running();
		b.moving(); 
		}

}
