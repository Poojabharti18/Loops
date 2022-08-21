
package loops;
import java.util.Scanner;

public class Evennaturalnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2==0)
			{
				System.out.println("even Natural number:"+i);
					
			}
			i++;
			
		}
		

	}

}
//WAP to print even natural numbers?
//===================================
//input:
//5
//
//output:
//2
//4
//======
