package loops;
import java.util.Scanner;

public class Primenumberexample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		int fact=0;
		do
		{
			if(n%i==0)
			{
				System.out.println(i);
				fact++;
			}
			i++;
		}
        while(i<=n);
		if(fact==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Composit Number");
		}
	}

}

