package com.Oops.java;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String bookname=sc.nextLine();
        
        System.out.println("Enter the price:");
        double price=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Author name:");
        String authorname=sc.nextLine();
        
        BookAuthor obj=new BookAuthor();
        obj.setBook_Name(bookname);
        obj.setBook_Price(price);
        obj.setBook_Type(authorname);
        System.out.println("Book Details");
        System.out.println("Book Name :"+obj.getBook_Name());
        System.out.println("Book Price :"+obj.getBook_Price());
        System.out.println("Author Name :"+obj.getBook_Type());
		

	}

}
