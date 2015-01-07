package com.maple.calculator;

public class Calculator {
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
	
		return a-b;
	}
	
	public static int mul(int a,int b)
	{
		return a*b;
	}
	
	public static float div(int a,int b)
	{
		return a/b;
	}
	
	public static void hexa(int a)
	{
		int count = 0;
		int k=0;
		int rest[] = new int [100];
		String array[] = new String [100];
		int i,j;
		
		for(i=a;i>0;)
		{
			j=i%16;
			i=i/16; 
			
			rest[count]=j; 
			count = count+1; 
		}
		
		for(int r=count-1;r>=0;r--)
		{
			if(rest[r]==10)
				array[k]="A";
			else if(rest[r]==11)
				array[k]="B";
			else if(rest[r]==12)
				array[k]="C";
			else if(rest[r]==13)
				array[k]="D";
			else if(rest[r]==14)
				array[k]="E";
			else if(rest[r]==15)
				array[k]="F";
			else
				array[k]=Integer.toString(rest[r]);
			k=k+1;
		}
		
		for(k=0;k<count;k++)
		{
			System.out.print(array[k]); 
		}
	}
}
	

