package com.yash.inheritance_polymorphism;

public class SavingsAccount extends Account{

	private double annualInterest;
	
	public SavingsAccount(double balance, int acc_no,double rate) {
		super(balance, acc_no);
		this.annualInterest = rate;
		
	}
	public double getInterest() {
		return annualInterest;
	}
	public void setInterest(double interest) {
		this.annualInterest = interest;
	}

	@Override
	   public void deposit(double amt) {

	       super.deposit(amt);

	   }

	   @Override
	   public void drawMoney(double amt) {
	       if (getbalance() > amt)
	           super.drawMoney(amt);
	   }

	   public double monthlyInterestRate() {
	       return annualInterest / 12;
	   }

	   public double getMonthlyInterest() {
	       return getbalance() * (monthlyInterestRate() / 100);
	   }

	   public void addInterest() {
	       super.deposit(getMonthlyInterest());

	   }


	   @Override
	   public String toString() {
	       return super.toString() + " Annual Interest: " + annualInterest;
	   }
	
}
