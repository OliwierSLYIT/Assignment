package ie.lyit.Testers;

import ie.lyit.Hotel.*;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empA = new Employee();
		
		System.out.println(empA);
		
		empA.setName(new Name("Mr", "Homer","Simpson"));
		empA.setAddress("Letterkenny");
		empA.setPhoneNumber("0871234567");
		empA.setDOB(new Date(1,1,2000));
		empA.setSalary(60000);
		empA.setStartDate(new Date(1,1,2011));
		
		System.out.println(empA);
		
		//public Employee(String t,String fN, String sN, String address, String phoneNo, int d, int m,int y, Date startDate,double salary )
		
		Employee empB = new Employee("Mr", "Bart","Simpson","Glenties","0879876543",2,2,2000,new Date(2,2,2011),50000);
		
		System.out.println(empB);
		
	}

}
