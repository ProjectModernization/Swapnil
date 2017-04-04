package com.test.modernization.Demo;

import org.junit.Test;
import static org.junit.Assert.*;

import junit.framework.TestCase;

public class ConditionTest extends TestCase {
	@Test
	public void test() {
		Condition condition1 = new Condition();
	
		//Tests for Vowels
		assertEquals("This letter a is a Vowel", condition1.checkAlphabetDigit('a'));
		assertEquals("This letter e is a Vowel", condition1.checkAlphabetDigit('e'));
		assertEquals("This letter i is a Vowel", condition1.checkAlphabetDigit('i'));
		
		//Tests for Consonants
	
		assertEquals("This letter b is a Consonant", condition1.checkAlphabetDigit('b'));
		assertEquals("This letter c is a Consonant", condition1.checkAlphabetDigit('c'));
		assertEquals("This letter d is a Consonant", condition1.checkAlphabetDigit('d'));
		
		//Tests for Digits
		assertEquals("This is a digit", condition1.checkAlphabetDigit('6'));
		assertEquals("This is a digit", condition1.checkAlphabetDigit('4'));
	}


}
