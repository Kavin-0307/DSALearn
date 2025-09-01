package bitMagic;
import java.util.*;
public class only1odd {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		int n1[]=new int[n];
		for(int i=0;i<n;i++)
		n1[i]=sc.nextInt();
 	    sc.close();
 	    int xor=0;
 	    for(int i=0;i<n;i++)
 	    	xor^=n1[i];
 	    
 	    System.out.println("Number occurring odd number of times is: "+xor);
	}
}
