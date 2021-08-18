package com.patterns.java;

import java.util.Scanner;

public class SumOfSq {

	public static void main(String[] args) {
        
        System.out.println("Enter how many natural numbers you want to sum: ");
        Scanner Sc =new Scanner(System.in);
        int input=Sc.nextInt();
        
        long difference=SumOfSqMinusSqOfSum(input);
        
        System.out.println("Diff between sumofsqu and sqofsum "+input+" natural numbers is : "+difference);
    }
    public static long SumOfSqMinusSqOfSum(int input)
    {
        long sumOfTheSquares=0;
        long squareOfTheSum=0;
        long difference=0;
        for(int i=1;i<=input;i++)
        {
            sumOfTheSquares+=(i*i);
            squareOfTheSum+=i;
        }
        squareOfTheSum=(squareOfTheSum*squareOfTheSum);
        difference=squareOfTheSum-sumOfTheSquares;
        return difference;
    }
}

	


