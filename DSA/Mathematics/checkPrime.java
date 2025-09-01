package Mathematics;
import java.util.*;
public class checkPrime {
       public static void main(String [] args)
       {
    	   Scanner sc=new Scanner(System.in);
    	   int n=sc.nextInt();
    	   if(n<0)
    	   {    		   
    		   System.out.println("Enter a number greater than 0");
    		   n=sc.nextInt();
    	   }
    	   sc.close();
    	   System.out.println(checkP(n));
    	   sc.close();
       }
       static boolean checkP(int n)
       {
    	   if(n==0||n==1)
    		   return false;
    	   if(n==2||n==3)
    		   return true;
    	   if(n%2==0||n%3==0)
    		   return false;
    	   for(int i=5;i*i<=n;i+=6)
    	   {
    		   if(n%i==0||n%(i+2)==0)
    			   return false;
    	   }
    	   return true;
       }
}
