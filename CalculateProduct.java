//2.4
import java.util.Scanner;

public class CalculateProduct{
	public static void main(String[] args){
		//int x, y, z;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter first Number: ");
		int x = input.nextInt();
		
		System.out.print("Enter second Number: ");
		int y = input.nextInt();
		
		System.out.print("Enter third Number: ");
		int z = input.nextInt();
		
		int result = x * y * z;
		
		System.out.printf("%s of x, y and z is %d %n","product",result);
	}
}