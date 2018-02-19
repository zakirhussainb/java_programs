package singletonATMExample;

import java.io.*;

public class Client
{

	public static void main(String[] args) 
	{
		String selectionChoice = "";
		String selection = "";
		System.out.println("Enter your Selection...: \n 1. Detailed Statement \n 2. Mini Statement");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			selectionChoice = br.readLine();
		}catch(IOException e) {e.printStackTrace();}
		
		if ( selectionChoice.equalsIgnoreCase("1") )
			selection = "detailedStmt";
		else if ( selectionChoice.equalsIgnoreCase("2") )
			selection = "miniStmt";
		
		Factory factory = StatementFactory.getUniqueInstance();
		System.out.println("factory....: " + factory);
		System.exit(-1);
		StatementType objStmtType = factory.createStatements(selection);
		System.out.println(objStmtType.print());

	}

}
