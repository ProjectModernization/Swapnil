package com.test.modernization.Demo;

public class Perform {

	public static void main(String[] args) {
		TopLevel();

	}
	public static void TopLevel(){
		System.out.println("In TopLevel. Starting to run program");
		OneLevelDown();
		System.out.println( "Back in TopLevel.");
		
	}
	public static void TwoLevelsDown(){
		 System.out.println(">>>>>>>> Now in TwoLevelsDown.");
		 ThreeLevelsDown();
		 System.out.println(">>>>>>>> Back in TwoLevelsDown.");	
		
	}
	public static void OneLevelDown(){
	    System.out.println(">>>> Now in OneLevelDown");
	    TwoLevelsDown();
	    System.out.println(">>>> Back in OneLevelDown");
	}
	public static void ThreeLevelsDown(){
		System.out.println(">>>>>>>>>>>> Now in ThreeLevelsDown");
	}

}
