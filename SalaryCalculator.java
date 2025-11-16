import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 0;


        while (count <= 3){

            System.out.println("Enter Your Work Hours: ");
            int hour = input.nextInt();

            System.out.println("Enter Your Hours Rate: ");
            int rate = input.nextInt();

            System.out.println("Enter Your Name: ");
            String name = input.next();

            int normalPay;
            int overTime;
            double result = 0;

            normalPay = hour * rate;

            if(hour > 40){
                 overTime = hour - 40;
                result =  (overTime *(rate * 1.5));

            }

            System.out.println("Name: "+ name);
            System.out.println("Your gross pay is:  "+ result);
            System.out.println("Your Normal Payment:  "+ normalPay);

            count++;
        }
    }
}
