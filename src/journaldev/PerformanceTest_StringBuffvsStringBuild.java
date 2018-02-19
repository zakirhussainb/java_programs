package journaldev;

import java.util.*;

public class PerformanceTest_StringBuffvsStringBuild 
{
	public static void main(String[] args) 
	{
		System.gc();
		
		
//		performanceStrBuf();
//		performanceStrBuld();
		
		System.gc();
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		StringBuffer sb = new StringBuffer();
//		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		System.out.println("Time Taken:"+(end-start) + "ms");
		System.out.println("Memory used:"+(startMemory-endMemory));
		
		
		
	}
	public static void performanceStrBuf()
	{
		long l_starttime = new GregorianCalendar().getTimeInMillis();
//		System.out.println("l_starttime..." + l_starttime);
		long l_startmem = Runtime.getRuntime().freeMemory();
//		System.out.println("l_startmem..." +  l_startmem);
		
		System.out.println("Performance test using StringBuffer...");
		StringBuffer sbf = new StringBuffer();
		for ( int i = 0; i < 10000000; i++ )
		{
			sbf.append(":").append(i);
		}
		
		long l_endtime = new GregorianCalendar().getTimeInMillis();
//		System.out.println("l_endtime..." + l_endtime);
		long l_endmem = Runtime.getRuntime().freeMemory();
//		System.out.println("l_endmem..." +  l_endmem);
		
		System.out.println("Time taken: " + (l_endtime - l_starttime) + "ms" );
		System.out.println("Memory used: " + (l_endmem - l_startmem) );
		
		
	}
	public static void performanceStrBuld()
	{
		long l_starttime = new GregorianCalendar().getTimeInMillis();
//		System.out.println("l_starttime..." + l_starttime);
		long l_startmem = Runtime.getRuntime().freeMemory();
//		System.out.println("l_startmem..." +  l_startmem);
		
		System.out.println("Performance test using StringBuilder...");
		StringBuffer sbld = new StringBuffer();
		for ( int i = 0; i < 10000000; i++ )
		{
			sbld.append(":").append(i);
		}
		
		long l_endtime = new GregorianCalendar().getTimeInMillis();
//		System.out.println("l_endtime..." + l_endtime);
		long l_endmem = Runtime.getRuntime().freeMemory();
//		System.out.println("l_endmem..." +  l_endmem);
		
		System.out.println("Time taken: " + (l_endtime - l_starttime) + "ms" );
		System.out.println("Memory used: " + (l_endmem - l_startmem) );
	}

};
