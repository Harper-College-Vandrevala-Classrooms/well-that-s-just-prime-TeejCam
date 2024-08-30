package com.csc;
import java.util.Scanner; 
import java.io.*;

public class Factorizer {

  // You should implement your solution here.
  public void PrimeFactors(int number) 
  {
    //there is some number here
    //divide it up into its prime factors
    //prime numbers only have two factors -- do we check this in a loop or what?
    //modular divide every number from 1 to 10, check if the remainder is 0
    //store the ones where the remainder is zero into a variable? then modular divide those too?
    //actually i have no idea
    String output = "";
    for (int i = 2; i <= number; i++) {
        while (number%i == 0) {
          //store i in a string or array
          number = number / i; 
          output += String.valueOf(i) + " "; //beware of this part
        }
    }

    //user has to enter a number but how?? in a main function???
    System.out.println("The prime factors of your number: " + output); //but wait wasnt the factorizer doing that up there?
  }
  // Feel free to delete this example method when you implement your solution.
  /*public int exampleMethod(int someArgument) {
    if (someArgument > 5) {  //numbers five and below are all prime
      return 1; //one factor?
    } else {
      return 2; //two factors?
    }
  }*/

  public static void main(String [] args) 
  {
    //user inputs something here? 
    //and then we output here?
    //how do you even take in user input in java
    Factorizer factorizer = new Factorizer();
                                //shouldnt the number that the user gave us be in here?
    //factorizer.PrimeFactors();
    int uNumber;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    uNumber = Integer.parseInt(scanner.nextLine());
    factorizer.PrimeFactors(uNumber); //isn't 9 hardcoding it though?
  }
}

/**
 * int unumber;
 cout << prompt user
 cin >> unumber;
 */