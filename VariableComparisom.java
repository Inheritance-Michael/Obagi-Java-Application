//2.3
import java.util.Scanner;

public class VariableComparisom{
	int c, thisIsAVariable, q76354, number;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		
		int value = input.nextInt();
		
		System.out.println("This is a java program");
		System.out.printf("%s%n%s%n","This a java","program");
		
		if(value != 7){
			System.out.printf("The %d is not equal to 7 %n",value);
		}
		else{
			System.out.printf("The %d is equal to 7 %n",value);
		}
	}
}