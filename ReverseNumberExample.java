package loops;
import java.util.Scanner;
  


public class ReverseNumberExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		int num=sc.nextInt();
		int digit=0,rev=0;
		while(num!=0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		System.out.println(rev);
	}
		
		
}
	


