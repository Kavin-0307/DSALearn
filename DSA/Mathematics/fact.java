package Mathematics;
import java.util.*;
public class fact {
   public static void main(String [] args)
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
	   System.out.println("Factorial of "+ n+ "is "+Fact(n));
   }
   static int Fact(int n)
   {
	   if(n==0||n==1)
		   return 1;
	   return n*Fact(n-1);
   }
}
