package com.exercise6loops.app;

public class forloop {

	public static void main(String[] args)
	{
		// constant declaration
		
		
		// variable declaration
		
		//objects construction
		
		//create a series of 1- 100 
		for (int i=1;i<=100; i++)
		{
			System.out.println(i);
			
		}
		
		for (int i=100;i>=1; i--)
		{
			System.out.println(i);
			
		}
		for (int i=0;i<=100; i+=2)
		{
			System.out.println(i);
			
		}
		System.out.println("display odd numbers from 100 to 200 "); 
		for (int i=100;i<200; i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("Display just half of the sequence 100");
		for (int i=100;i<200; i++)
		{
			System.out.println(i);
			if (i==150)
			{
				break;
			}
			
		}

	}

}
