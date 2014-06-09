//Problem #1
//Hammad Asad

//Problem Description:
/*

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

Uses concepts of inclusion-exclusion principles

*/ 

import java.util.*; 

public class Problem1{

 public static int multiples(int number, int counter){

  if(counter==0) return 0; 

  if(counter%number==0){
    
   return counter + multiples(number,counter-1);
   
  }else{

   return 0 + multiples(number,counter-1);

  }

 }

 public static void main(String[] args){
  int sum1=multiples(5,999);
  int sum2=multiples(3,999); 
  int excludedSum=multiples(15,999); 
  int total=sum1+sum2-excludedSum; 
  
  System.out.println("The sum of all multiples of 3 or 5 below 1000 is : " + total); 
 }



}

