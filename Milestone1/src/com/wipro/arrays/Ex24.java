package com.wipro.arrays;
import java.util.Scanner;

public class Ex24 {
	  public static void main(String args[])
	   {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int[] a=new int[n];
	        for(int i=0;i<n;i++)
	        {
	              a[i]=sc.nextInt();
	              char c=(char)a[i]; 
	              System.out.println(a[i]+"="+c);
	         }
	        sc.close();
	    }
}
