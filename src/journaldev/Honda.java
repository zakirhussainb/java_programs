package journaldev;

abstract class Bike 
{
	abstract void run();
}
class Honda extends Bike
{
	@Override
	void run()
	{
		System.out.println("Running safely....");
		
	}
	public static void main(String args[])
	{
		Honda obj = new Honda();
		obj.run();
	}
}
