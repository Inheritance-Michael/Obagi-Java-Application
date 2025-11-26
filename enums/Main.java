package enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Ender a day of the week: ");
        String userInput = input.next().toLowerCase();


        try{
            Day day = Day.valueOf(userInput);

            switch (day){
                case monday,
                     tursday,
                     wenesday,
                     thurday,
                     friday -> System.out.println("This is a weekday");
                case saturday,
                     sunday -> System.out.println("This is a weekend");

            }
        }
        catch (
                Exception e
        ){
            System.out.println("Enter a valid day...");
        }

        input.close();
    }
}
