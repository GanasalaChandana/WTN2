package com.wipro.arrays;
import java.util.Scanner;

public class Ex21 {
	public static void main(String[]args)
	{
	int n,sum=0;
	float avg;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of elements in the array");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	sum=sum+a[i];
	}
	System.out.println("Sum:"+sum);
	avg=(float)sum/n;
	System.out.println("Avg:"+avg);
	sc.close();
	}
}
