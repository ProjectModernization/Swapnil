package com.test.modernization.Demo;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
        Condition obj = new Condition();
        String result = obj.checkAlphabetDigit(ch);
        System.out.println(result);
		
        
	}
	public String checkAlphabetDigit(char ch){
		if(ch >='a' && ch <= 'z' || Character.isDigit(ch))
        {
	        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	        {
	            return "This letter "+ch+" is a Vowel";
	        }
	        else if(Character.isDigit(ch))
	        {
	        	return "This is a digit";
	        }
	        else
	        {
	            return "This letter "+ch+" is a Consonant";
	        }
	        
        }
        else
        {
        	return "Problems found";
        }

	}

}
