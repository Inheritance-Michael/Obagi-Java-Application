//2.28
import java.util.Scanner;

public class AreaOfACircle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the radius of a circle: ");
		int radius = input.nextInt();
		System.out.println();
		
		float pi = 3.14159f;
		float area = pi * (radius * radius);
		
		int diameter = 2 * radius;
		float circumference = pi * radius;
		
		System.out.printf("The Area of a circle is: %f %n",area);
		System.out.printf("The Diameter of a circle is: %d %n",diameter);
		System.out.printf("The Circumference of a circle is: %f %n",circumference);
	}
}