package mainJava;

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class Axis extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}
public class Java_OOPS 
{
	static int val = 0;
	public static void main(String[] args) 
	{
		Bank sbi = new SBI();// run-time polymorphism
		Bank icici = new ICICI();
		Bank axis = new Axis();
		System.out.println("SBI roi is " + sbi.getRateOfInterest() + "%");
		System.out.println("ICICI roi is " + icici.getRateOfInterest() + "%");
		System.out.println("AXIS roi is " + axis.getRateOfInterest() + "%");
		
	}

}
