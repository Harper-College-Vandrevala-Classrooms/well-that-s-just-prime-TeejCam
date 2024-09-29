package com.csc;
import java.util.Scanner; 

public class Factorizer {

  // You should implement your solution here.
  public String PrimeFactors(int number) 
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
    //System.out.println("The prime factors of your number: " + output); 
    return output;
  }

  public boolean isPrime(int number)
  {
    String factors = PrimeFactors(number);
    factors = factors.stripTrailing();
    if (factors.equals(String.valueOf(number))) {
        return true;
    }
    else {
      return false;
    }
  }

  public static void main(String [] args) 
  {
    Factorizer factorizer = new Factorizer();
    factorizer.isPrime(36); // Returns false
    factorizer.isPrime(12); // Returns false
    factorizer.isPrime(17); // Returns true
    factorizer.isPrime(1); // Returns false
    factorizer.isPrime(0); // Returns false
  }
}