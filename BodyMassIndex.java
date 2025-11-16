//1.10
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display result
		System.out.println("");
        System.out.printf("Your BMI is: %.2f\n %n", bmi);
		
		System.out.println("BMI VALUES");
		System.out.println("Underweight: \t less than 18.5");
		System.out.println("Normal: \t between 18.5 and 24.9");
		System.out.println("Overweight: \t between 25 and 29.9");
		System.out.println("Obese: \t 30 or greater");
		
        // BMI categories***
		/**
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }**/
    }
}