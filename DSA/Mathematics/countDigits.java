package Mathematics;
import java.util.*;
public class countDigits {
    public static void main(String [] args)
    {
    	//this is a program to count and print the number of digits in a number
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number");
    	int n=sc.nextInt();
    	int f=0,t=n;
    	if(n<0) {
    		System.out.println("Wrong input");
    		System.exit(0);
    	}
    	while(n>0)
    	{
    		f++;
    		n/=10;
    	}
    	System.out.println("The number of digits of "+t+" is "+f);
    	sc.close();
    }
}
