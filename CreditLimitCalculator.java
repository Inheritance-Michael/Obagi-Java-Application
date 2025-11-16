import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Your Account Number (0 to quit): ");
            int accountNumber = input.nextInt();
            
            if (accountNumber == 0) {
                System.out.println("Program ended.");
                break;
            }

            System.out.print("Enter Your Beginning Balance: ");
            int balance = input.nextInt();

            System.out.print("Enter Your Total Charges for the Month: ");
            int charges = input.nextInt();

            System.out.print("Enter Your Total Credits Applied for the Month: ");
            int credits = input.nextInt();

            System.out.print("Enter Your Allowed Credit Limit: ");
            int creditLimit = input.nextInt();

            // Calculate new balance
            int newBalance = balance + charges - credits;

            // Display new balance
            System.out.printf("%nAccount Number: %d%n", accountNumber);
            System.out.printf("New Balance: %d%n", newBalance);

            // Check credit limit
            if (newBalance > creditLimit) {
                System.out.println("Credit Limit Exceeded");
            }

            System.out.println(); // Blank line between customers
        }

        input.close();
    }
}
