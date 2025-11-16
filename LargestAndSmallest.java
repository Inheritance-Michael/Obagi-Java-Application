//2.24
import java.util.Scanner;

public class LargestAndSmallest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter five integers to determine the largest and smallest integer");
		System.out.println();
		
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		int num3 = input.nextInt();
		
		System.out.print("Enter fouth integer: ");
		int num4 = input.nextInt();
		
		System.out.print("Enter firth integer: ");
		int num5 = input.nextInt();
		System.out.println();
		
		int max = num1;
		int min = num1;
		
		//largest
		if(num2 > max){
			max = num2;
		}
		if(num3 > max){
			max = num3;
		}
		if(num4 > max){
			max = num4;
		}
		if(num5 > max){
			max = num5;
		}
		
		//smallest
		if(num2 < min){
			min = num2;
		}
		if(num3 < min){
			min = num3;
		}
		if(num4 < min){
			min = num4;
		}
		if(num5 < min){
			min = num5;
		}
		
		System.out.printf("Largest Number is (max):"+max +"%n");
		System.out.printf("Smallest Number is (min):"+min +"%n");
	}
}