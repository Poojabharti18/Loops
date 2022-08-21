package loops;
import java.util.Scanner;

public class DigitCountanotherexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int digit=0,evencount=0,oddcount=0;
		for(int num=sc.nextInt();num!=0;)
		{
			digit=num%10;
			if(digit%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println("Odd count=:"+oddcount);
		System.out.println("Even count=:"+evencount);

	}

}
