package mainJava;

import java.io.*;

public class MoveToTrash {

	public static void main(String[] args) 
	{
		// NEED TO USE MULTITHREADING FOR SCANNING EACH INNER FOLDER
		String sDir = "d:\\";
//		List<File> list = new ArrayList<File>();
		listAllFiles(sDir);
//		listAllFoldersFiles(sDir);
		
		
		
		
		
		/*File file = new File("d:\\");
		File[] arrFile = file.listFiles();
		String str = "";
		double val = 0;
		for (File f : arrFile)
		{
			str = f.getName();
			
			if ( str.indexOf(".sql")>=0 )
			{
				val = ( f.length() / 1024 ) / 1024;
				if (val > 100)
				{
					System.out.println("file name--->" + f.getName() + " | file length--->" + val);
				}
				
			}
		}*/

	}
	private static void listAllFiles(String dir)
	{
		File filedir = new File(dir);
		File[] arrF = null;
		try
		{
			arrF = filedir.listFiles();
		}
		catch(Exception e)
		{
			System.out.println("Exception in arrF[] " + e);
		}
		
//		System.out.println(Arrays.asList(arrF));
//		System.exit(0);
		String str = "";
		double val = 0;
		int j = 0;
		try
		{
			for (int i = 0; i < arrF.length; i++ )
			{
				if ( arrF[i].isFile() )
				{
//					System.out.println("FILE--->" + arrF[i].getName() );
					str = arrF[i].getName();
					if ( str.indexOf(".sql")>=0 )
					{
						val = ( arrF[i].length() / 1024 ) / 1024;
						if ( val > 10000 )
						{
							System.out.println("file path--->" + arrF[i].getParentFile()+ "|" + "file name--->" + arrF[i].getName() + "|" + "file last modified--->" + arrF[i].lastModified() + "|" +"file length--->" + val);
//							arrF[i].getParentFile()
						}
					}
					
				}
				
				else if ( arrF[i].isDirectory() )
				{
//					System.out.println("DIRECTORY--->" + arrF[i].getAbsolutePath() );
					listAllFiles(arrF[i].getAbsolutePath());
				}
			}
	
		}
		catch(Exception e)
		{
			System.out.println("Exception as it...." + e);
		}
				
		
		
		
		/*for ( File f : arrF )
		{
			if ( f.isFile() )
			{
				files.add(f);
				System.out.println("files...." + files);
			}
			else if (f.isDirectory())
			{
				listAllFiles(f.getAbsolutePath(), files);
			}
		}*/
		
	}
	/*private static void listAllFoldersFiles(String string) 
	{
		System.out.println("dir..." + string);
		String sPath = "";
		File file = new File(string);
		File[] arrF = file.listFiles();
		for ( File f : arrF)
		{
			if (f.isFile())
			{
				System.out.println("f..." + f.getName());
			}
			else if (f.isDirectory())
			{
				sPath = f.getAbsolutePath();
				if ( sPath.indexOf("$")<=0 || sPath.indexOf(".")<=0 || sPath.indexOf("-")<=0 )
				{
					listAllFoldersFiles(sPath);
				}
			}
			
		}
		
	}*/

}
