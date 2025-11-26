import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;
        int largest = 1;
        int secondLargest =0;


        while(count <= 5){

            System.out.print("Enter Random Numbers: ");
            int number = input.nextInt();

            if (number > largest){
                largest = secondLargest;
                largest = number;
            }else{
                if(number > secondLargest){
                    secondLargest = number;
                }
            }
            count++;
        }
        System.out.println("largest: "+largest);
        System.out.println("Second largest: " +secondLargest);
    }
}
