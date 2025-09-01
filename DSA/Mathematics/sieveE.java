package Mathematics;
import java.util.*;
public class sieveE {
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
    	 System.out.println("Primes between 1 and n are:");
    	 sieve(n);
    	
    }
    static void sieve(int n)
    {
    	boolean b1[]=new boolean[n+1];
    	Arrays.fill(b1,true);
    	for(int i=2;i<=n;i++)
    	{		if(b1[i]) {
    		    	for(int j=2*i;j<=n;j+=i)
    					b1[j]=false;
    			}
         }
    	for(int i=2;i<=n;i++)
    		if(b1[i])
    			System.out.print(i+" ");
    }
}
