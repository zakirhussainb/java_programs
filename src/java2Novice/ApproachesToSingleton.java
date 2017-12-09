package java2Novice;

/** Singleton Class Concept:-
 * > Private constructor to restrict initialization of the class from other classes.
 * > Private static variable of the same class that is the only instance of the class.
 * > Public static method that returns the instance of the class, 
 *   this is the global access point for outer world to get the instance of the singleton class.
 *   
 *  Different Approaches of Singleton pattern implementation:-
 * 
 * @author Zakirhussain
 */
public class ApproachesToSingleton
{
	public static void main(String[] args) 
	{
		EagerInitializedSingleton eis = EagerInitializedSingleton.getInstance();
		System.out.println("EagerInitializedSingleton.......: " + eis.e);
		
		StaticBlockInitialization stat = StaticBlockInitialization.getInstance();
		System.out.println("StaticBlockInitialization.......: " + stat.s);
		
		LazyInitialization lazy = LazyInitialization.getInstance();
		System.out.println("LazyInitialization.......: " + lazy.l);
		
		ThreadSafeSingleton ths = ThreadSafeSingleton.getInstance();
		System.out.println("ThreadSafeSingleton.......: " + ths.t);
		
		ThreadSafeSingleton ths_lock = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println("ThreadSafeSingleton UsingDoubleLocking.......: " + ths_lock.t);
		
		BillPughSingleton bps = BillPughSingleton.getInstance();
		System.out.print("BillPughSingleton...." + bps.b);
	}
}
class EagerInitializedSingleton 
{
	/* Instance created at the time of class loading
	 * Drawback is > instance is created even though the client application might not be using it
	 * 			   > Doesn't provide any options for exception handling*/
	
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	public String e;
	private EagerInitializedSingleton()
	{
		e = "I am a EagerInitializedSingleton...I welcome you";
	}
	
	public static EagerInitializedSingleton getInstance()
	{
		return instance;
	}
}
class StaticBlockInitialization
{
	/* Same as above, except that instance of the class is created inside a static block, 
	 * that provides options for exception handling */
	private static StaticBlockInitialization instance;
	static
	{
		try
		{
			instance = new StaticBlockInitialization();// creating instance inside static block
		}catch(Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance using StaticBlockInitialization");
		}
	}
	public String s;
	private StaticBlockInitialization() // private constructor
	{
		s = "I am a StaticBlockInitialization of Singleton.....I welcome you";
	}
	public static StaticBlockInitialization getInstance()//global access method
	{
		return instance;
	}	
}
class LazyInitialization
{
	/* Creates instance in the global access method 
	 * Limitations:- works fine with single threaded systems, but causes  if multiple threads are inside the if loop at the same time.
	 * It will destroy the singleton pattern and both threads will get the different instances of singleton class
	 *  */
	private static LazyInitialization instance;
	public String l;
	private LazyInitialization()
	{
		l = "I am a LazyInitialization of Singleton.....I welcome you";
	}
	public static LazyInitialization getInstance()// global access method
	{
		if ( instance == null )
		{
			instance = new LazyInitialization();// creating instance
		}
		return instance;
	}
}
class ThreadSafeSingleton
{
	/* Easiest way to create a ThreadSafeSingleton class is to make the global access method synchronized
	 * So that only one thread can execute the method at a time.
	 * Drawbacks:- Reduces the performance*/
	private static ThreadSafeSingleton instance;
	public String t;
	private ThreadSafeSingleton()
	{
		t = "I am a ThreadSafeSingleton Class.....I welcome you";
	}
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if ( instance == null )
		{
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	/* To avoid extra overhead everytime, double checked locking principle is used. 
	 * In this approach, the synchronized block is used inside the if condition with an 
	 * additional check to ensure that only one instance of singleton class is created.*/
	
	public static ThreadSafeSingleton getInstanceUsingDoubleLocking()
	{
		if ( instance == null )
		{
			synchronized( ThreadSafeSingleton.class)
			{
				if ( instance == null )
				{
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	
}

class BillPughSingleton
{
	/* create the Singleton class using a inner static helper class
	 * When the singleton class is loaded, SingletonHelper class is not loaded into memory 
	 * and only when someone calls the getInstance method, this class gets loaded and creates the Singleton class instance.
	 * Most widely used approach for Singleton class as it doesn’t require synchronization*/
	public String b;
	private BillPughSingleton()
	{
		b = "I am a BillPughSingleton Class.....I welcome you";
	}
	public static class SingletonHelper
	{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}
	
}

