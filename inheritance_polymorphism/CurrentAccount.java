package com.yash.inheritance_polymorphism;

public class CurrentAccount extends Account {

	private double creditLimit;
	public CurrentAccount(double balance, int acc_no, double creditLimit) {
		super(balance, acc_no);
		this.creditLimit=creditLimit;
		
	}
	  // Implementing the deposit method
	   @Override
	   public void deposit(double amt) {
	       super.deposit(amt);
	   }

	   // Implementing the withdraw method
	   @Override
	   public void drawMoney(double amt) {
	       if (getbalance() >= amt)
	           super.drawMoney(amt);
	   }


	   @Override
	   public String toString() {
	       return super.toString() + " Credit Limt: " + creditLimit;
	   }
	

}
