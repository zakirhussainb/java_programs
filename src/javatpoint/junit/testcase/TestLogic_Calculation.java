package javatpoint.junit.testcase;

import org.junit.Test;
import javatpoint.junit.logic.*;
import static org.junit.Assert.*; 

public class TestLogic_Calculation 
{
	/*@Test
	public void testFindMax()
	{
		boolean bResult = false;
//		void asserEquals(boolean expected, boolean actual);
		assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  */
	@Test
	public void testReverseWord()
	{
		 System.out.println("test case reverse word"); 
		 System.out.println("reverse word...." + Calculation.reverseWord("my name is khan"));
	     assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan"));  
	}

}
