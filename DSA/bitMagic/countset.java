package bitMagic;
import java.util.*;
public class countset {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<0)
 	   {
 		   System.out.println("Enter a positive number");
 		   n=sc.nextInt();
 	   }
 	   sc.close();
 	   System.out.println(count(n));
	}
	static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			n&=n-1;
			count++;
		}
		return count;
	}
}
