//2.15

import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers, Then prints their sum, product, difference and quotient (division)");
		System.out.println();
		
		System.out.print("Enter Fisrt Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		int product = num1 * num2;
		int difference = num1 - num2;
		int quotient = num1 / num2;
		
		System.out.printf("The sum of %d + %d = %d %n",num1,num2,sum);
		System.out.printf("The product of %d * %d = %d %n",num1,num2,product);
		System.out.printf("The difference of %d - %d = %d %n",num1,num2,difference);
		System.out.printf("The quotient of %d / %d = %d %n",num1,num2,quotient);
	}
}