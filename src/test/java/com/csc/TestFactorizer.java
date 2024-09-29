package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
  @Test
  public void testZero() {
    assertEquals("", factorizer.PrimeFactors(0));
  }

  @Test
  public void testOne() {
    assertEquals("", factorizer.PrimeFactors(1));
  }

  @Test
  public void testTen() {
    assertEquals("2 5 ", factorizer.PrimeFactors(10));
  }    

  @Test
  public void testNine() {
    assertEquals("3 3 ", factorizer.PrimeFactors(9));
  }

  @Test
  public void testThirtySix() {
    assertFalse(factorizer.isPrime(36));
  }

  @Test
  public void testTwelve() {
    assertFalse(factorizer.isPrime(12));
  }

  @Test
  public void testPrimeSeventeen() {
    assertTrue(factorizer.isPrime(17));
  }

  @Test
  public void testSeventeen() {
    assertEquals("17 ", factorizer.PrimeFactors(17));
  }

  @Test
  public void testPrimeOne() {
    assertFalse(factorizer.isPrime(1));
  }

  @Test
  public void testPrimeZero() {
    assertFalse(factorizer.isPrime(0));
  }
}
