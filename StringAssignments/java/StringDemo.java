package com.StringAssignments.java;
import java.lang.*;
import java.util.Scanner;
public class StringDemo {
private String input;
 public static void main(String args[]) {

Scanner sc =new Scanner(System.in); 
String input=sc.nextLine();

StringDemo sd=new StringDemo(); 
sd.setInput (input);
String res =sd.getRequiredData();
 System.out.println(res);
}
 private String getRequiredData() {

String res;
if(input=="") {


res="there is no String";
}else {
res=input;
 }
return res;
 }
public void setInput (String input) {
this.input = input;
}
}
/*Create a class StringDemo
 Create a Test class as StringDemoTest
 Create a field as input in StringDemo
 Create appropriate getter and constructor method
 Create getRequiredData(String input) method that should
return the provided String unchanged
 For example you have input as “Java Test” then it should return
Java Test string as it is, if nothing is provided then “there is no
String” should be returned.*/