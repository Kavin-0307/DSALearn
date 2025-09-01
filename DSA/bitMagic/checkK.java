package bitMagic;
import java.util.*;
public class checkK {
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
		System.out.println("Enter bit to check");
		int k=sc.nextInt();
 	   sc.close();
 	   check(n,k);
	}
	static void check(int n,int k)
	{
		int x=1<<(k-1);
		if((n&x)!=0)
			System.out.println("Bit is set");
		else
			System.out.println("Bit is not set");
		
	}
	
}
