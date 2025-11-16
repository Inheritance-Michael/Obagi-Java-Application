//chat GPT example

import java.util.Scanner;

public class Celsius{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Celsius: ");
		double c = input.nextDouble();
		
		double f = ((double)9/5) * c + 32;
		
		System.out.printf("%.2f is %.2f %n",c,f);
	}
}