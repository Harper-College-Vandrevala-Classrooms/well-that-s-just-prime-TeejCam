package com.csc;
import java.util.Scanner; 

public class Factorizer {

  // You should implement your solution here.
  public void PrimeFactors(int number) 
  {
    String output = "";
    if (number > 1){
      for (int i = 2; i <= number; i++) {
        while (number%i == 0) {
          //store i in a string or array
          number = number / i; 
          output += String.valueOf(i) + " "; 
        }
      }
    }
    System.out.println("The prime factors of your number: " + output); //but wait wasnt the factorizer doing that up there?
  }

  public static void main(String [] args) 
  {
    Factorizer factorizer = new Factorizer();
    factorizer.PrimeFactors(100);
  }
}