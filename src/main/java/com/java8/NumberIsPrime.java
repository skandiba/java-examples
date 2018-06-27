package com.java8;

public class NumberIsPrime {

	private int numberOne;
	private int numberTwo;
	private int numberThree;
	
	public NumberIsPrime() {
	}

	public NumberIsPrime(int numberOne) {
		this.numberOne = numberOne;
	}
	
	public NumberIsPrime(int numberOne,int numberTwo, int numberThree) {
		this.numberOne = numberOne;
		this.numberTwo = numberTwo;
		this.numberThree = numberThree;
	}
	
	public boolean isAllNumbersPrime() {
		boolean result = true;
		
		for(int i=0;i<3;i++) {
			if(i== 0) {
				result = isPrimeNumber(numberOne);
			}
			else if(i== 1) {
				result = isPrimeNumber(numberTwo);
			}
			else if(i== 2) {
				result = isPrimeNumber(numberThree);
			}
			if(!result) {
				break;
			}
		}
		return result;
	}	
	
	public boolean isPrimeNumber(int number) {
		boolean result = true;		
		if(number <= 2) {
			result = false;
		}
		for(int i=2;i<(number/2);i++) 
		if(number%i == 0) {
			result = false;
		System.out.println(number+  "   ==  is Not Prime   ==  "+result);	
		}
		System.out.println(number+  "   ==  is Prime       ==  "+result);
		return result;
	}	
	
	public boolean isNumberOnePrimeNumber() {
		return isPrimeNumber(numberOne);		
	}
	
	public int getNumberOne() {
		return numberOne;
	}
	
	public void setNumberOne(int numberOne) {
		this.numberOne = numberOne;
	}
	
	public int getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(int numberTwo) {
		this.numberTwo = numberTwo;
	}

	public int getNumberThree() {
		return numberThree;
	}

	public void setNumberThree(int numberThree) {
		this.numberThree = numberThree;
	}	
	
}