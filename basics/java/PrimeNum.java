package com.yash.basics.java;
import java.util.*;
public class PrimeNum {
	public static void main(String args[]){    
		
		{
            int n,flag;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter n value:  ");
            n=sc.nextInt();
            System.out.println("\nPrimenumbers are : ");
            for(int i=2;i<=n;i++)
            {
              flag=0;
              for(int j=2;j<=i/2;j++)
               if((i%j)==0)
                {
                  flag=1;
                  break;
                     }
            if(flag==0)
            System.out.print(i+"   ");
            }	            
	   }
		}
}


