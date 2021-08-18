package com.yash.inheritance_polymorphism;

public class Bank1 {

	 private int limit;
	   private Account accounts[] = null;
	   private int cnt;
	   private static int NEXTACCNO = 101;

	   public Bank1(int limit) {
	       this.limit = limit;
	       accounts = new Account[limit];
	       this.cnt = 0;
	   }

	   public void openSavingsAccount(int balance, double rate) {
	       if (cnt != limit) {
	           accounts[cnt] = new SavingsAccount(NEXTACCNO, balance, rate);
	           NEXTACCNO++;
	           cnt++;
	       }
	   }

	   public void openCurrentAccount(int balance, int creditLimit) {
	       if (cnt != limit) {
	           accounts[cnt] = new CurrentAccount(NEXTACCNO, balance, creditLimit);
	           NEXTACCNO++;
	           cnt++;
	       }

	   }


	   public void printAccounts() {
	       for (int i = 0; i < cnt; i++) {
	           System.out.println(accounts[i]);
	       }

	   }


	  
	   public void deposit(int accNo,double amt)
	   {
	       int indx=-1;
	       for(int i=0;i <amt;i++)       {
	           if(accounts[accNo].getAccNo()==accNo)
	           {
	               indx=accNo;
	           }
	       }
	       if(indx!=-1)
	       {
	           accounts[indx].deposit(amt);
	       }
	   }
	   public void withdraw(int accNo,double amt)
	   {
	       int indx=-1;
	       for(int i=0;i <amt;i++)       {
	           if(accounts[accNo].getAccNo()==accNo)
	           {
	               indx=accNo;
	           }
	       }
	       if(indx!=-1)
	       {
	           accounts[indx].drawMoney(amt);
	       }
	   }
	  
	   public void addInterest(int accNo)
	   {
	       int indx=-1;
	       for(int i=0;i <limit;i++)      {
	           if(accounts[accNo].getAccNo()==accNo)
	           {
	               indx=accNo;
	           }
	       }
	       if(indx!=-1 && (accounts[indx] instanceof SavingsAccount))
	       {
	           ((SavingsAccount)(accounts[indx])).addInterest();
	       }  
	   }
}
