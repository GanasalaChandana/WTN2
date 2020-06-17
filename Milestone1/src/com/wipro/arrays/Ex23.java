package com.wipro.arrays;
import java.util.Scanner;

public class Ex23 {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n,flag=0,i;
	System.out.println("enter the number of elements in the array");
	n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array elements");
	for( i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println("enter the search element");
	int key=sc.nextInt();
	for(i=0;i<n;i++)
	{
	if(key==a[i])
	{
	flag=1;
	break;
	}
	else
	{
	flag=0;
	}
	}
	if(flag==1)
	{
	System.out.println(i);
	}
	else
	{
	System.out.println(-1);
	}
	sc.close();
	}
}
