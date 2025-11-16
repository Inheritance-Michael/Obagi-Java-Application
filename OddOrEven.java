//2.25
import java.util.Scanner;

public class OddOrEven{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter an integer to determine whether odd or even");
		System.out.println();
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		System.out.println();
		
		if(num % 2 == 0){
			System.out.printf("%d is an even number",num);
		}
		else{
			System.out.printf("%d is an odd number",num);
		}
	}
}