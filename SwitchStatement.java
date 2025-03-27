import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Subscribe Data");
		System.out.println("Enter *310# To Subscribe Data");
		System.out.println("Enter *606# To Subscribe Data");
		System.out.println("");
		
		System.out.print("Enter Code: ");
		String code = input.nextLine();
		
		switch (code){
			case "*131#":{
				System.out.println("Enter 1 For 1 Month Data Subscribe");
				System.out.println("Enter 2 For 2 Month Data Subscribe");
				System.out.println("Enter 3 For 3 Month Data Subscribe");
				System.out.println("Enter 4 For 4 Month Data Subscribe");
				System.out.println("");
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch (option){
					case 1 :{
						System.out.println("Your 1 month subscribtion has been activated");
					}
					break;
					
					case 2 :{
						System.out.println("Your 2 month subscribtion has been activated");
					}
					break;
					
					case 3 :{
						System.out.println("Your 3 month subscribtion has been activated");
					}
					break;
					
					case 4 :{
						System.out.println("Your 4 month subscribtion has been activated");
					}
					break;
					
					default:
					System.out.println("Invalid input");
				}	
			}
			break;
			
			case "*310#":{
				System.out.println("Your Balance is: $245.85");
			}
			break;
			
			case "*606#":{
				System.out.println("Enter 1 to Borrow $1000");
				System.out.println("Enter 2 to Borrow $2000");
				System.out.println("Enter 3 to Borrow $3000");
				System.out.println("Enter 4 to Borrow $4000");
				System.out.println("");
				
				System.out.print("Enter Code: ");
				int option = input.nextInt();
				
				switch (option){
					case 1 :{
						System.out.println("You have Borrowed $1000");
					}
					break;
					
					case 2 :{
						System.out.println("You have Borrowed $2000");
					}
					break;
					
					case 3 :{
						System.out.println("You have Borrowed $3000");
					}
					break;
					
					case 4 :{
						System.out.println("Your have Borrowed $4000");
					}
					break;
					
					default:
					System.out.println("Invalid input");
				}
			}
			break;
			default:
			System.out.println("Invalid input");
		}
		
	}
}