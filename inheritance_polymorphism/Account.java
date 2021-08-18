package com.yash.inheritance_polymorphism;

public class Account {
	
	private double balance;
	private int acc_no;
	public Account(double balance, int acc_no) {
		super();
		this.balance = balance;
		this.acc_no = acc_no;
	}
	public void deposit(double sum) {
		if(sum>0) {
			balance += sum;
		}else {
			System.out.print("Account.deposit(sum)" +"cannot deposit amount" );
			
		}
	}
	
	public void drawMoney(double sum) {
		
		if(sum>0) {
			balance -= sum;
			
		}else {
			
			System.out.println("Account.drawMoney(sum)" +"cannot draw the money");
		}
	}
	public double getbalance() {
		
		return balance;
	}
	public int getAccNo() {
		
		return acc_no;
	}
	
	  public String toString() {
	       return "Acc " + acc_no + ": " + "balance = " + balance;
	   }
	  public final void print() {
	     
	       System.out.println(toString());
	   }
}
