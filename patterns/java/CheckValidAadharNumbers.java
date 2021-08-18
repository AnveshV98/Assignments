package com.patterns.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidAadharNumbers {
	public static boolean
    isValidAadharNumber(String str)
    {
      
        String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
 
     
        Pattern p = Pattern.compile(regex);
 
    
        if (str == null) {
            return false;
        }
 
        Matcher m = p.matcher(str);
 
        return m.matches();
    }

    public static void main(String args[])
    {
 
 
        String str1 = "3646 2598 7893";
        System.out.println(isValidAadharNumber(str1));
 
       
        String str2 = "36461 2598 7893";
        System.out.println(isValidAadharNumber(str2));
 
        
        String str3 = "364 2598 7893";
        System.out.println(isValidAadharNumber(str3));
 
       
        String str4 = "0646 2598 7893";
        System.out.println(isValidAadharNumber(str4));
 
     
        String str5 = "3646 02598 789";
        System.out.println(isValidAadharNumber(str5));
    }
	

}
