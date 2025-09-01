package Mathematics;
import java.util.*;
public class primeFactors {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		 if(n<0)
		   {
			   
			   System.out.println("Enter a number greater than 0");
			   n=sc.nextInt();
		   }
		 sc.close();
		 System.out.println("The Prime factors of n are:");
		 primef(n);
		   
	}
	static void primef(int n)
	{
		while(n%2==0)
		{
			System.out.print(2+" ");
			n/=2;
		}
		
		while(n%3==0)
		{
			System.out.print(3+" ");
			n/=3;
		}
			for(int i=5;i*i<=n;i+=6)
 	  {
 		  while(n%i==0)
 		  {
 			  System.out.print(i+" ");
 			  n/=i;
 		  }
 		 while(n%(i+2)==0)
		  {
			  System.out.print(i+2+" ");
			  n/=(i+2);
		  }
 	   }
 	   
	}

}
