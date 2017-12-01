package ie.lyit.Hotel;

public abstract class Person {

	protected Name name;
	protected String address;
	protected String phoneNumber;
	
	public Person()
	{
		name = new Name();
		address = null;
		phoneNumber = null;
	}
	public Person(String t,String fN,String sN, String address, String phoneNumber)
	{
		name = new Name(t,fN,sN);
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public String toString()
	{
		//return "Title : " +name.getTitle() + "First name : " +name.getFirstName() +"Surname : " 
	//+ name.getSurname() + " Address : " +address + " Phone number : " + phoneNumber;
				
		return name + "," + address + "," + phoneNumber;
	}
	
	public boolean equals(Object obj) 
	{
		Person pObject;
		if(obj instanceof Person)
			pObject = (Person)obj;
		else 
			return false;
		
		return(name.equals(pObject.name) &&
				address.equals(pObject.address) &&
				phoneNumber.equals(pObject.phoneNumber));
	}
	
	public void setName(Name nameIn)
	{
		name = nameIn;
	}
	
	public Name getName()
	{
		return name;
	}
	
	public void setAddress(String addressIn)
	{
		address = addressIn;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setPhoneNumber(String phoneNumberIn)
	{
		phoneNumber = phoneNumberIn;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	

	
}
