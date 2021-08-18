package com.yash.basics.java;

public class DemoString {

	public static void main(String[] args) {
		
		String s1 = "Yash Technologies";
		System.out.println(s1);
		String s2 = new String("Yash Technologies");
		System.out.println(s2);
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("s"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.replace("o", "o"));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0));
	}

}
