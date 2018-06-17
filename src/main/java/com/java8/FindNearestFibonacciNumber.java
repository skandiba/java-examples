package com.java8;

public class FindNearestFibonacciNumber 
{	
	public static void main(String s[])
    {
        int input = 9;
        int result = findNearestFibonacciNumber(input);
        System.out.println("The nearest Fibonacci number for " + input + " is " + result);
		fibanocciSeries(20);
    }
	
	public static int findNearestFibonacciNumber(int input) 
	{ 
		//Write code here to find the nearest Fibonacci number to the given input and return the same. 
	int result = -1;
	int a = 1;
	int b = 2;
	while( a <= input + b) 
		{ 
			if ( input >= a && input < b) 
			{ 
				if((input - a) <= (b - input)) 
					{ 
						result = a; 
						System.out.println("if  "+result);
					} 
				else 
					{ 
						result = b;
						System.out.println("else  "+result);
					} 
				break;
			} 
			int temp = a + b; 
			a = b;
			b = temp;
		} 
		return result;
	}

public static void fibanocciSeries(int size)
	{
		int i,t1=0,t2=1,tn=0;
		System.out.print(t1+","+t2+",");
		
		for(i=1;i<size;i++)
			{
				tn=t1+t2;
				System.out.print(tn+",");
				t1=t2;
				t2=tn;
			}
	 } 

}