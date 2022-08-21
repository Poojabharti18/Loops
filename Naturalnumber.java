//WAP to print the natural numbers?
//
//input:5
//
//
//out:1
//2
//3
//4
//5
//=============================================================





package loops;
import java.util.Scanner;

public class Naturalnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}

	}

}
