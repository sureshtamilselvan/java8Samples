package com.java.samples.mockitoJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

// @RunWith attaches a runner with the test class to initialize the test data
public class MathApplicationTester {
	
	MathApplication calcObject;
	   @BeforeEach                                         
	   void setUp() {
	       calcObject = new MathApplication();
	   }
	   @Test                                               
	   @DisplayName("Add 2 numbers")   
	   void addTest() {
	       assertEquals(15, calcObject.add(10, 5));  
	   }
	   @RepeatedTest(5)                                    
	   @DisplayName("Adding a number with zero to return the same number")
	   void testAddWithZero() {
	       assertEquals(15, calcObject.add(0, 15));
	   }
}