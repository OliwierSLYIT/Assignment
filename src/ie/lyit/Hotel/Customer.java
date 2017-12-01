//part 1 - add an interface


package ie.lyit.Hotel;

public class Customer extends Person {
	
	private String emailAddress;
	private int number;
	
	private static int nextNumber =1;
	
	
	public Customer()
	{
		super();
		emailAddress= null;
		//making sure every customer has a unique number
		number = nextNumber++;
	}
	
	public Customer(String t,String fN, String sN, String a, String pN ,String emaiAddress)
	{
		super(t,fN,sN,a,pN);
		this.emailAddress = emailAddress;
		number= nextNumber++;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "," +emailAddress;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Customer cObject;
		if(obj instanceof Customer)
			cObject= (Customer)obj;
		else return false;
		
		return(number==cObject.number);
	}
	
	public void setEmailAddress(String emailIn)
	{
		emailAddress = emailIn;
	}
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public int getNumber()
	{
		return number;
	}

}
