//2.26
import java.util.Scanner;

public class Multiples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter an integer to determine whether odd or even");
		System.out.println();
		
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		System.out.println();
		
		if(num1 % num2 == 0){
			System.out.printf("%d and %d are multiples %n",num1,num2);
		}
		else{
			System.out.printf("%d and %d are not multiples",num1,num2);
		}
	}
}