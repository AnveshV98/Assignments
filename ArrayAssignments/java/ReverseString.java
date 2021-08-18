package com.ArrayAssignments.java;

public class ReverseString {
	
	static void reverse(char str[],
            int start,
            int end)
{

char temp;

while (start <= end)
{

temp = str[start];
str[start] = str[end];
str[end] = temp;
start++;
end--;
}
}
//Function to reverse words
static char[] reverseIt(char []s)
{
int start = 0;
for (int end = 0; end < s.length; end++)
{

if (s[end] == ' ')
{
reverse(s, start, end);
start = end + 1;
}
}
reverse(s, start, s.length - 1);

reverse(s, 0, s.length - 1);
return s;
}

public static void main(String[] args)
{
String s = "i work for yash technologies ";
char []p = reverseIt(s.toCharArray());
System.out.print(p);
}

}
