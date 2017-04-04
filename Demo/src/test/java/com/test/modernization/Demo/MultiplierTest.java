package com.test.modernization.Demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplierTest {

	@Test
	public void testMultiply() {
		Multiplier obj = new Multiplier();
	    //Test for two positive numbers
		assertEquals(10, obj.multiply(2, 5));
		//Test for two negative numbers
		assertEquals(10, obj.multiply(-2, -5));
		//Test for one positive and one negative number
		assertEquals(-10, obj.multiply(-2, 5));

	}

}