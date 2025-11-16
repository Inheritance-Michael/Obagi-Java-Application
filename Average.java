//2.17

import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter three integers, which will the prints their sum, product, average between them");
		System.out.println();
		
		System.out.print("Enter Fisrt Number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter Second Number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third Number: ");
		int num3= input.nextInt();
		
		int sum = num1 + num2 + num3;
		int product = num1 * num2 * num3;
		int average = (num1 + num2 + num3) /3;
		
		
		System.out.printf("The sum of %d + %d + %d = %d %n",num1,num2,num3,sum);
		System.out.printf("The product of %d * %d * %d = %d %n",num1,num2,num3,product);
		System.out.printf("The average of %d, %d, %d = %d %n",num1,num2,num3,average);
	}
}