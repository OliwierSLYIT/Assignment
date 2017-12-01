package ie.lyit.Testers;

import ie.lyit.Hotel.*;
import java.util.ArrayList;
public class NameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name personA = new Name();
		
		
		//display details of personA
		System.out.println(personA);
		
		//set personA's details
		personA.setTitle("Mr");
		personA.setFirstName("Homer");
		personA.setSurname("Simpson");
		
		//print out personA updated details
		System.out.println(personA);
		
		
		Name personB = new Name("Mr","Bart","Simpson");
		
		System.out.println(personB);
		
		if(personA.equals(personB))
		{
			System.out.println(personA + " is the same as " + personB);
		}
		else
			System.out.println(personA + " is not the same as " +personB);
		
		
		
		
		if(personA.equals(personB))
		{
			System.out.println(personA + " is female.");
		}
		else
			System.out.println(personA + " is not female.");
		
		
		ArrayList<Name> names = new ArrayList<Name>();
		names.add(new Name("Ms", "Lisa", "Simpson"));
		names.add(personA);
		names.add(personB);
		names.trimToSize( );
		
		for(Name tempName:names)
			System.out.println(tempName);
		
		if(nameSearch(personA,names))
			System.out.println("NAME FOUND!");
		else
			System.out.println("NAME NOT FOUND!");
	}
		public static boolean nameSearch(Name searchName, ArrayList<Name> listOfNames)
		{
			
			for (Name currentName:listOfNames) 
			{
				if(currentName.equals(searchName))
					return true;
			}
			
			return false;
			
		}
		
		
	}


