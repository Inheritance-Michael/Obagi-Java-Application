import java.util.Scanner;

public class NestedIfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter Your Mark: ");
		int mark = input.nextInt();
		
		if (mark >100){
			System.out.println("You can not score above 100");
		}
		else{
			if (mark >= 80){
				System.out.printf("Candidate Name: %s %n",name);
				System.out.printf("Candidate Mark: %d %n",mark);
				System.out.printf("Candidate Grade: %c %n",'A');
			}
			else if (mark >= 70){
				System.out.printf("Candidate Name: %s %n",name);
				System.out.printf("Candidate Mark: %d %n",mark);
				System.out.printf("Candidate Grade: %c %n",'B');
			}
			else if (mark >= 60){
				System.out.printf("Candidate Name: %s %n",name);
				System.out.printf("Candidate Mark: %d %n",mark);
				System.out.printf("Candidate Grade: %c %n",'c');
			}
			else if (mark >= 50){
				System.out.printf("Candidate Name: %s %n",name);
				System.out.printf("Candidate Mark: %d %n",mark);
				System.out.printf("Candidate Grade: %c %n",'D');
			}
			else if (mark >= 40){
				System.out.printf("Candidate Name: %s %n",name);
				System.out.printf("Candidate Mark: %d %n",mark);
				System.out.printf("Candidate Grade: %c %n",'E');
			}
			else{
				System.out.printf("Candidate Name: %s %n",name);
				System.out.printf("Candidate Mark: %d %n",mark);
				System.out.printf("Candidate Grade: %c %n",'F');
			}
		}
	}
}