//2.32

import java.util.Scanner;
public class NegativePositiveAndZeroValues{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int pcount = 0;
		int ncount = 0;
		int zcount = 0;
		
		System.out.println("Enter 5-Digits: ");
		
		for(int i = 1; i <= 5; i++){
			System.out.print("Enter " + i + "-Digits: ");
			int number = input.nextInt(); //Get input
			
			if(number < 0){
				ncount++;
			}
			else if(number > 0){
				pcount++;
			}
			else{
				zcount++;
			}
		}
		
		System.out.println();
		System.out.printf("Number of Nagative integer: " + ncount + "%n");
		System.out.printf("Number of Positive integer: " + pcount + "%n");
		System.out.printf("Number of positive zero: " + zcount + "%n");
	}
}