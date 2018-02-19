package geeksForgeeks;

public class TestingAccessMods_Super 
{
//	public String emp_name = "Zakir";//works
//	private String emp_name = "Zakir";
//	protected String emp_name = "Zakir";
//	abstract String emp_name = "Zakir";
	volatile String emp_name = "Zakir";
//	transient String emp_name = "Zakir";
	
	protected static void method_A()
	{
		System.out.println("Hello I am testing a Class....");
		
		final int emp_id = 123;
		
	}
}
