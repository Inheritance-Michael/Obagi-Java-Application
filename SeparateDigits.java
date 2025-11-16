//2.30

import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();  // Get input

        String numStr = Integer.toString(number);  // Convert to string

        System.out.print("Separated digits: ");
        System.out.printf("%s %s %s %s %s%n", 
            numStr.charAt(0), 
            numStr.charAt(1), 
            numStr.charAt(2), 
            numStr.charAt(3), 
            numStr.charAt(4));
    }
}