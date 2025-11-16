import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count = 0;
        int number ;
        int largest = 0;

        while(count <= 3){
            System.out.print("Enter a number: ");
            number  = input.nextInt();

//            number += newNumber;

            if(number > largest){
                largest = number;
            }

            count++;
        }

        System.out.print("The largest number is " + largest);
    }
}
