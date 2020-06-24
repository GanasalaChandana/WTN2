package com.wipro.loops;

public class Ex10 {
	public static void main(String args[])
    {
        String s=args[0];
        char ch=s.charAt(0);
        char temp;
        if(ch>='a'&&ch<='z')
        {
	temp=Character.toUpperCase(ch);
	System.out.println(ch+"->"+temp);
         }
        else if(ch>='A'&&ch<='Z')
        {
	temp=Character.toLowerCase(ch);
	System.out.println(ch+"->"+temp);
         }
        else
	System.out.println("Enter a valid Alphabet");
    }
}
