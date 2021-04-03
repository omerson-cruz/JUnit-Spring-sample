package com.myproject.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Before  // will run for every test method
	public void before() {
		System.out.println("Before");
	}
	
	@After  // will run after every test
	public void after() {
		System.out.println("After test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("@BeforeClass @After");
	}
	
	// MyMath.sum
	// 1,2,3 => 6
	@Test  // signify that this is a unit test
	public void sum_with3numbers() {
		// Absence of failure is success
		System.out.println(myMath.sum(new int[] {1,2,3}));
		
		int result  = myMath.sum(new int[] {1,2,3});
		
		// Check that result is 6
		assertEquals(6, result);
	}
	
	public void sum_with1number() {
		int result = myMath.sum(new int[] {1});
		
		assertEquals(1, result);
	}

}
