package Mathematics;
import java.util.*;
public class Palin {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();//Accept a number
		int digit=0,rev=0;
		if(n<0)
		{
			System.out.println("Wrong input! \nPlease enter a number greater than 0");
			n=sc.nextInt();
		}
		int temp=n;
		sc.close();
		while(n>0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		if(rev==temp)
			System.out.println(temp+" is a Palindrome number");
		else

			System.out.println(temp+" is not a Palindrome number");
		
	}

}
