package ie.lyit.Hotel;

public interface Payable {

	public abstract double calculateWage(double taxPercentage);
	//public double incrementSalary(double incrementAmount);
	
	double incrementSalary(double incrementAmount);
	
}
