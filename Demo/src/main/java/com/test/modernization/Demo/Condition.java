package com.test.modernization.Demo;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch >='a' && ch <= 'z' || Character.isDigit(ch))
        {
	        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	        {
	            System.out.print("This letter "+ch+" is a Vowel");
	        }
	        else if(Character.isDigit(ch))
	        {
	        	System.out.println("This is a digit");
	        }
	        else
	        {
	            System.out.print("This letter "+ch+" is a Consonant");
	        }
	        
        }
        else
        {
        	System.out.println("Problems found");
        }

	}

}
