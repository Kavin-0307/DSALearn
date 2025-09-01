package Mathematics;
import java.util.*;
public class GCD_LCM {
   public static void main(String[] args)
   {
	   //this is a program to compute the gcd or lcm of two numbers based on user choice
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Do you want: \n[G]Gcd \n[L]LCM");
	   char ch=sc.next().charAt(0);
	   switch(ch)
	   {
		   case 'G':System.out.println("Enter two numbers");
		   			int n1=sc.nextInt();
		   			int n2=sc.nextInt();
		   			System.out.println("GCD of "+n1+" & "+n2+" is "+GCD(n1,n2));
		   			break;
		   case 'L':System.out.println("Enter two numbers");
  					int a1=sc.nextInt();
  					int b1=sc.nextInt();
  					int lcm=(a1*b1)/GCD(a1,b1);
  					System.out.println("LCM of  "+a1+" and "+b1+" is "+lcm);
  					break;
	   }
	   sc.close();
   }
   static int GCD(int n1,int n2)
   {
	   if(n2==0)
		   return n1;
	   return GCD(n2,n1%n2);
   }
}
