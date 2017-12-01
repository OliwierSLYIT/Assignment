package ie.lyit.Testers;


import ie.lyit.Hotel.Date;
import java.util.Scanner;

public class DateTester{
	public static void main(String[] args) {
		Date d1 = new Date();
        System.out.println(d1);      

	    d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);
		
		System.out.println(d1);
      
		Date d2 = new Date(28, 12, 1982);
        System.out.println(d2);
      
		if(d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");
		
		Date myDate1 = new Date();
		int setDayTo=32, setMonthTo = 13, setYearTo = 1832;
		boolean goodInput = false;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			try {
				myDate1.setDay(setDayTo);
				myDate1.setMonth(setMonthTo);
				myDate1.setYear(setYearTo);
				goodInput=true;
			}
			catch(IllegalArgumentException iEA)
			{
				System.out.println("incorrect day, month or year");
				
				System.out.print("RE-ENTER VALID VALUE FOR Day: ");
				setDayTo = keyboard.nextInt();
				
				System.out.print("RE-ENTER VALID VALUE FOR Month: ");
				setMonthTo = keyboard.nextInt();
				
				System.out.print("RE-ENTER VALID VALUE FOR Year: ");
				setYearTo = keyboard.nextInt();
			}
		}while(!goodInput);
		
		int setDay=35, setMonth = 13, setYear = 1832;
		goodInput=false;
		do {
			try {
				Date myDate2 = new Date(setDay,setMonth,setYear);
			}
			catch(IllegalArgumentException iEA)
			{
				System.out.println("Incorrect date.");
				
				System.out.print("RE-ENTER VALID VALUE FOR Day: ");
				setDay = keyboard.nextInt();
				
				System.out.print("RE-ENTER VALID VALUE FOR Month: ");
				setMonth = keyboard.nextInt();
				
				System.out.print("RE-ENTER VALID VALUE FOR Year: ");
				setYear = keyboard.nextInt();
			}
		}while(!goodInput);
	}
}