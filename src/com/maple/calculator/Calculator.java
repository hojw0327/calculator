package com.maple.calculator;

public class Calculator {
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
	
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public float div(int a,int b)
	{
		return a/b;
	}
	
	public void hexadecimal_change(int a)
	{
		int count = 0;
		int rest[] = new int [100]; //16으로 나눈 나머지가 저장
		
		for(int i=a,j=0;i>0;)
		{
			j=i%16;
			i=i/16; 
			
			rest[count]=j; 
			count = count+1; 
		}
		
		for(int r=count-1;r>=0;r--)
		{
			if(rest[r]==10){
				System.out.print("A");
				}
			else if(rest[r]==11){
				System.out.print("B");
				}
			else if(rest[r]==12){
				System.out.print("C");
				}
			else if(rest[r]==13){
				System.out.print("D");
				}
			else if(rest[r]==14){
				System.out.print("E");
				}
			else if(rest[r]==15){
				System.out.print("F");
				}
			else{
				System.out.print(rest[r]);
				}
		}
	}
}
	

