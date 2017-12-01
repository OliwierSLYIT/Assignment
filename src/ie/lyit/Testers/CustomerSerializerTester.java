package ie.lyit.Testers;

import ie.lyit.serialize.CustomerSerializer;
import ie.lyit.serialize.*;
import java.util.Scanner;

public class CustomerSerializerTester 
{
	public static void main(String[] args) {

	int option;
	CustomerSerializer custSerializer = new CustomerSerializer();
	Menu menu = new Menu();
	
	menu.display();
	menu.readOption();
	option = menu.getOption();
	custSerializer.readRecordsFromFile();
	
	 do {
		if(option == 1)
			custSerializer.add();
		else if(option == 2)
			custSerializer.list();
		else if(option == 3)
			custSerializer.view();
		else if(option == 4)
		{		
		   	Scanner kbUserEdit = new Scanner(System.in);
		   	//Scanner kbNameEdit = new Scanner(System.in);
		   	Scanner kbAddEdit = new Scanner(System.in);
		   	Scanner kbEmailEdit = new Scanner(System.in);
		   	Scanner kbPhoneEdit = new Scanner(System.in); 
		   	
			//ask the user the name of the customer they would like to edit
		   	System.out.print("Which Customer would you like to edit? (Name):");
			String editUser = kbUserEdit.next();
			
			//System.out.print("New name: ");
			//String newName = kbNameEdit.next();
			
			System.out.print("New address: ");
			String newAdd = kbAddEdit.next();
			
			System.out.print("New email address: ");
			String newEmail = kbEmailEdit.next();
			
			System.out.print("New phone number: ");
			String newPhone = kbPhoneEdit.next();
			
			custSerializer.edit(editUser, newAdd, newEmail, newPhone); //newName
		}
		else if(option == 5)
		{
			//ask the user for the name of the customer they want to delete
			Scanner kbUserDelete = new Scanner(System.in);
			System.out.print("Which Customer would you like to delete? (Name): ");
			String deleteUser = kbUserDelete.next();
			custSerializer.delete(deleteUser);
		}
	}while(option != 6);
	
	custSerializer.writeRecordsToFile();
	
	}
}
