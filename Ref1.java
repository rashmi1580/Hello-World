import java.io.*;
import java.util.*;
class Ref1
	{
		public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			if(a>=0)
			{
				System.out.println("It is a positive number");
			}
			else
			{
				System.out.println("It is a negative number");
			}
		}
	}