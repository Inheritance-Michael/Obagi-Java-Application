import java.util.Scanner;

public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args){


                Scanner input = new Scanner(System.in);

                System.out.print("Enter a four-digit number: ");
                int number = input.nextInt();

                // Extract digits
                int d1 = number / 1000;
                int d2 = (number / 100) % 10;
                int d3 = (number / 10) % 10;
                int d4 = number % 10;

                // Encrypt each digit
                d1 = (d1 + 7) % 10;
                d2 = (d2 + 7) % 10;
                d3 = (d3 + 7) % 10;
                d4 = (d4 + 7) % 10;

                // Swap digits: 1↔3 and 2↔4
                int temp;

                temp = d1;
                d1 = d3;
                d3 = temp;

                temp = d2;
                d2 = d4;
                d4 = temp;

                // Combine digits back
                int encrypted = d1 * 1000 + d2 * 100 + d3 * 10 + d4;

                System.out.println("Encrypted number: " + encrypted);


    }
}
