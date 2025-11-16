//2.8
import java.util.Scanner;

public class SamplePayroll{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int b = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int c = input.nextInt();
		
		int a = b * c;
		
		System.out.printf("the product of %d and %d is %d",b,c,a);
		
		/*
		this program calculation
		a simple payroll
		*/
	}
}