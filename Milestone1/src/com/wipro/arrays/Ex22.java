package com.wipro.arrays;
import java.util.Scanner;

public class Ex22 {
	public static void main(String[]args)
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements of array");
	n=sc.nextInt();
	int a[]=new int[n];

	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	int min=a[0];
	int max=a[0];

	for(int i=1;i<n;i++)
	{
	if(a[i]<min)
	min=a[i];
	}
	for(int i=1;i<n;i++)
	{
	 if(a[i]>max)
	max=a[i];
	}
	System.out.println("Min:"+min);
	System.out.println("Max:"+max);
	sc.close();
	}
}
