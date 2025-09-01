package Mathematics;
import java.util.*;
public class trailing0 {
       public static void main(String[] args)
       {
    	   //This is a program to calculate the number of 0s at the end of n!
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter a number");
    	   int n=sc.nextInt();
    	   if(n<0)
    	   {
    		   System.out.println("Enter a positive number");
    		   n=sc.nextInt();
    	   }
    	   sc.close();
    	   int ans=0;
    	   for(int i=5;n/i>0;i*=5)
    		   ans=ans+n/i;
    	   System.out.println("Number of trailing zeros in factorial of"+n+" is "+ans);
    			   
       }
}
