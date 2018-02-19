package java2Novice;

import java.util.*;

public class ArrayListImplementation 
{
	private Object[] myStore;
	private int actSize = 0;
	
	public ArrayListImplementation()
	{
		myStore = new Object[10];
	}
	public void add (Object obj) 
	{
		if ( myStore.length - actSize <= 5 )
		{
			increaseListSize();
		}
		myStore[actSize++] =  obj;
	}
	private void increaseListSize()
	{
        myStore = Arrays.copyOf(myStore, myStore.length*2);
        System.out.println("\nNew length: " + myStore.length);
    }
	public static void main(String[] args) 
	{
		ArrayListImplementation ai = new ArrayListImplementation();
		ai.add(5);
		System.out.println("ai..." + ai);

	}

};
