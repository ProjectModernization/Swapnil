package com.test.modernization.Demo;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Accept {

	public static void main(String[] args) throws ParseException {
		String line;
		String[] lineVector;
		StudentDetails st = new StudentDetails();
		CurrentDate date = new CurrentDate();
		DayofYear dayOfYear = new DayofYear();
		CurrentTime time = new CurrentTime();
		
		System.out.println("Enter student details using template below");
	    System.out.println("Enter - ID,Surname,Initials,CourseCode,Gender");
	    Scanner scan = new Scanner(System.in);
	    
	    line = scan.nextLine(); //read 1,2,3

        //separate all values by comma
        lineVector = line.split(",");

        //parsing the values to Integer
        st.ID=Integer.parseInt(lineVector[0]);
        st.surname= lineVector[1];
        st.initials=lineVector[2];
        st.courseCode = lineVector[3];
        st.gender = lineVector[4];
      
        
        String date1 = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
        System.out.println(date1);
        String[] dateSplit = date1.split("-");
	    date.currentYear = Integer.parseInt(dateSplit[0]);
	    date.currentMonth = Integer.parseInt(dateSplit[1]);
	    date.currentDay = Integer.parseInt(dateSplit[2]);
	    
	    time.currentHour = Integer.parseInt(dateSplit[3]);
	    time.currentMinute = Integer.parseInt(dateSplit[4]);
	    time.CurrentSecond = Integer.parseInt(dateSplit[5]);
	    
	    
	    String inputDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
	    Date dt1=format1.parse(inputDate);
	    DateFormat format2=new SimpleDateFormat("EEEE"); 
	    String finalDay=format2.format(dt1);
	    System.out.println(finalDay);
	    
	    
	    System.out.println("Name is: "+ st.initials+ " "+st.surname);
	    System.out.println("Date is: "+ date.currentDay +" "+date.currentMonth+" "+date.currentYear);
	    System.out.println("Time is: "+time.currentHour+":"+time.currentMinute);
	}

}

class StudentDetails {
	int ID;
	String surname, initials;
	String courseCode;
	String gender;	
}

class CurrentDate{
	int currentYear, currentMonth, currentDay;
}
class DayofYear{
	int year, day;
}
class CurrentTime{
	int currentHour, currentMinute,CurrentSecond;
}
