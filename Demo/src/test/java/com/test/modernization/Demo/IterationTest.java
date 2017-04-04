package com.test.modernization.Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class IterationTest {

	@Test
	public void test() {
		
		//Test Multiply function
		
		Iteration obj = new Iteration();
	    //Test for two positive numbers
		assertEquals(10, obj.multiply(2, 5));
		//Test for two negative numbers
		assertEquals(10, obj.multiply(-2, -5));
		//Test for one positive and one negative number
		assertEquals(-10, obj.multiply(-2, 5));
		
		
		//Test Addition function
		
	   //Test for two positive numbers
		assertEquals(7, obj.addition(2, 5));
		//Test for two negative numbers
		assertEquals(-7, obj.addition(-2, -5));
		//Test for one positive and one negative number
		assertEquals(3, obj.addition(-2, 5));
	}

}
