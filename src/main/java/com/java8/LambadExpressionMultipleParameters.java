package com.java8;

interface ArithmeticException{  
    int arith(int x,int y);
}  
  
public class LambadExpressionMultipleParameters{  
    public static void main(String[] args) {  
          
        // Multiple parameters in lambda expression  
    	
    	ArithmeticException add=(x,y)->(x+y);  
        System.out.println("Sum(x,y) == "+add.arith(10,20));  
          
        // Multiple parameters with data type in lambda expression  

        // Lambda expression without return keyword. 
        ArithmeticException sub=(x,y)->(x-y);  
        System.out.println("Sub(x,y) == "+sub.arith(10,20));  
        
        // Lambda expression with return keyword.    
        ArithmeticException addreturn=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println("Sum with return "+addreturn.arith(1000,200));  
        
        ArithmeticException mul=(x,y)->(x*y);  
        System.out.println("Mul(x,y) == "+mul.arith(15,15));  
        
        ArithmeticException div=(x,y)->(x/y);  
        System.out.println("Division(x,y) == "+div.arith(20,10));
        
        ArithmeticException divi=(x,y)->(x/y);  
        System.out.println("Division(x,y) by Zero == "+divi.arith(10,0));
 
    }  
}  


