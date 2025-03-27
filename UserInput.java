import java.util.Scanner;


public class UserInput{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		
		
		System.out.print("Enter Your name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Your address: ");
		String address = input.nextLine();
		
		System.out.print("Enter Your age: ");
		byte age = input.nextByte();
		
		System.out.print("Enter Your Account Balance: ");
		float accountBal = input.nextFloat();
		
		System.out.print("Do you love java(True/False): ");
		boolean isJava = input.nextBoolean();
		System.out.println();
		
		
		System.out.printf("Hello %s, You are welcome to First Bank %n",name);
		System.out.printf("Your Account Balance is %c %.2f %n",'$',accountBal);
		System.out.printf("Your are living in %s %n", address);
		System.out.printf("Your are %d years old",age);
		System.out.printf("%s Do you love Java? %b %n",name,isJava);
	}
}