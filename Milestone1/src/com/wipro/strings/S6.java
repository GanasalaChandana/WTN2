package com.wipro.strings;

public class S6 {
public static void main(String[] args) {
	String a="hi";
	String b="hello";
	String res;
	if(a.length()<b.length())
		 res=a+b+a;
	else
		res=b+a+b;
	System.out.println(res);
	
}
}
