package bitMagic;
import java.util.*;
public class powerSet {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
 	   sc.close();
 	   pset(s);
	}
	static void pset(String s1)
	{
		int n=s1.length();
		int pSize=(int)Math.pow(2,n);
		for(int c=0;c<pSize;c++)
		{
			for(int j=0;j<n;j++)
			{
				if((c&(1<<j))!=0)
					System.out.print(s1.charAt(j));
			}
			System.out.println();
		}
	}
}
