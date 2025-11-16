import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

        while (true) {
            System.out.print("Enter Trips Location: ");
            String location = input.nextLine(); // Read trip location

            System.out.print("Mile Driven (enter 0 to stop): ");
            int mile = input.nextInt();

            if (mile == 0) {
                break; // Exit loop if 0
            }

            System.out.print("Gallon Used: ");
            int gallon = input.nextInt();
            input.nextLine(); // Consume leftover newline

            double mpg = (double) mile / gallon;
            System.out.printf("The trip to %s has MPG: %.2f%n", location, mpg);

            totalMiles += mile;     // Add to total miles
            totalGallons += gallon; // Add to total gallons
        }

        if (totalGallons > 0) {
            double overallMPG = (double) totalMiles / totalGallons;
            System.out.printf("The Overall MPG: %.2f%n", overallMPG);
        } else {
            System.out.println("No valid trips were entered.");
        }
    }
}
