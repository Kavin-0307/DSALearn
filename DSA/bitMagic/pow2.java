package bitMagic;
import java.util.*;
public class pow2 {
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
			 System.out.println(power2(n));
		}
	static boolean power2(int n)
	{
		return (n&n-1)==0;
	}

}
