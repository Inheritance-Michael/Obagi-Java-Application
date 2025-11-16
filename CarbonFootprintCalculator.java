//1.9
import java.util.Scanner;

public class CarbonFootprintCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your average monthly electricity bill (₦): ");
        double electricity = input.nextDouble();

        System.out.print("Enter your average monthly natural gas bill (₦): ");
        double gas = input.nextDouble();

        System.out.print("Enter your average monthly oil bill (₦): ");
        double oil = input.nextDouble();

        System.out.print("Enter your total annual vehicle mileage (km): ");
        double mileage = input.nextDouble();

        System.out.print("Enter the number of short flights (< 4 hours): ");
        int shortFlights = input.nextInt();

        System.out.print("Enter the number of long flights (> 4 hours): ");
        int longFlights = input.nextInt();

        System.out.print("Do you recycle newspaper? (yes/no): ");
        boolean recyclePaper = input.next().equalsIgnoreCase("yes");

        System.out.print("Do you recycle aluminum and tin? (yes/no): ");
        boolean recycleCans = input.next().equalsIgnoreCase("yes");

        // Calculate carbon footprint
        double totalFootprint = 0;

        totalFootprint += electricity * 12 * 105;    // Electricity
        totalFootprint += gas * 12 * 105;             // Natural gas
        totalFootprint += oil * 12 * 113;             // Heating oil
        totalFootprint += mileage * 0.79;             // Vehicle
        totalFootprint += shortFlights * 1100;        // Flights < 4 hrs
        totalFootprint += longFlights * 4400;         // Flights > 4 hrs

        if (!recyclePaper) {
            totalFootprint += 184;
        }
        if (!recycleCans) {
            totalFootprint += 166;
        }

        System.out.printf("\nYour estimated annual carbon footprint is: %.2f pounds of CO2\n", totalFootprint);
    }
}
