package ie.lyit.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;


import ie.lyit.Hotel.*;

public class CustomerSerializer 
{
	//declare an arryList of customer objects called customers
	private	ArrayList<Customer> customers;
	
	private final String FILENAME = "customers.ser";
	
	
	public CustomerSerializer()
	{
		customers = new ArrayList<Customer>();
	}
	
	public void add()
	{
		Customer cust = new Customer();
		//cust.();
		customers.add(cust); //add the new customer to customers
	}
	
	public String view()
	{
		Customer cust = new Customer();
		return cust.toString();
	}
	
	public void list()
	{
		//get all customer objects from customers and print them to screen 
		for(Customer tmpCustomer:customers)
			System.out.println(tmpCustomer);
	}
	
	public void edit(String editCust,String addressIn,String emailIn,String phoneNumberIn)
	{
		//
		for(Customer tmpCustEdit:customers)
		{
			if(editCust.equals(tmpCustEdit.getName()))
			{
				//edit Customer specified by the user
				//tmpCustEdit.setName(nameIn);
				tmpCustEdit.setAddress(addressIn);
				tmpCustEdit.setEmailAddress(emailIn);
				tmpCustEdit.setPhoneNumber(phoneNumberIn);
				
			}
			
		}
	}
	
	public void delete(String delCust)
	{
		for(Customer tmpCustDel:customers)
		{
			if(delCust.equals(tmpCustDel.getName()))
			{
				//delete Customer specified by the user
				customers.remove(tmpCustDel);
				System.out.println("Customer " +tmpCustDel +"has benn deleted.");
			}
			
		}
	}
	
	public void writeRecordsToFile()
	{
		try {
			FileOutputStream filestream = new FileOutputStream(FILENAME);
		
			ObjectOutputStream os = new ObjectOutputStream(filestream);
			os.writeObject(customers);
			os.close();
		
	
		}
		catch(FileNotFoundException fNFE)
		{
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE)
		{
			System.out.println(ioE.getMessage());
		}
	}
	
	public void readRecordsFromFile()
	{
		try {
			FileInputStream fileStream = new FileInputStream(FILENAME);
			
			ObjectInputStream is = new ObjectInputStream(fileStream);
			
			customers = (ArrayList<Customer>)is.readObject();
			
			is.close();
		}
		catch(FileNotFoundException fNFE)
		{
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException iOE)
		{
			System.out.println(iOE.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
