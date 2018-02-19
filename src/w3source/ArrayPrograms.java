package w3source;

public class ArrayPrograms 
{
	public static void main(String[] args) 
	{
//		Write a Java program to print the following grid.
		/*int [][]a = new int[10][10];
		for ( int i = 0 ; i < 10; i++ )
		{
			for ( int j = i + 1; j < 10; j++ )
			{
				System.out.printf("%s " , a[i][j]);
			}
			System.out.println();
		}*/
		
//		Write a Java program to sum values of an array.
		/*int arr[] = {20, 30, 25, 35, -16, 60, -100};
		int sum = 0;
		for ( int i : arr )
		{
			sum += i;
		}
		System.out.println("sum...: " + sum);
		double avg = sum / arr.length;
		System.out.println("avg...: " + avg);*/
		
		
		int arr[] = {20, 30, 25, 35, -16, 60, -100};
		int num = 15;
		for ( int i = 0;i < arr.length; i++ )
		{
			if ( arr[i] == num )
			{
				System.out.println("num is present " + num);
			}
			
		}
		
		
		
	};
};;
