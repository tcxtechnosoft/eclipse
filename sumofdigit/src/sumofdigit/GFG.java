package sumofdigit;

// Java program to compute  
//sum of digits in number. 
import java.io.*; 

class GFG { 
   
 /* Function to get sum of digits */
 //static int getSum(int n) 
	int n=0;
	void get()
 {     
     int sum = 0; 
       
     while (n != 0) 
     { 
         sum = sum + n % 10; 
         n = n/10; 
     } 
     System.out.println("the value is"+n);
   
// return sum; 
 } 

 // Driver program 
 public static void main(String[] args) 
 { 
	 GFG f=new GFG();
	 f.get();
    // int n = 687; 

     //System.out.println(getSum(n)); 
 } 
} 