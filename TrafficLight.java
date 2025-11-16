import java.util.Scanner;

import static java.lang.Thread.sleep;

public class TrafficLight {
    enum Light {
        
        RED(10, "Stop"),
        YELLOW(3, "Get Ready"),
        GREEN(15, "Go");

        private final int duration;
        private final String message;

        Light(int duration, String message) {
            this.duration = duration;
            this.message =message;
        }

        public int getDuration(){
            return this.duration;
        }

        public String getMessage(){
            return this.message;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of Run Time: ");
        int input = scanner.nextInt();

        int i = 0;
        while (input > 0){
            while(i < Light.values().length ){
                System.out.print("Light: " + Light.values()[i] + "\t");
                System.out.print("Duration: " + Light.values()[i].getDuration()+ " seconds \t");
                System.out.println(Light.values()[i] +" Say's "+ Light.values()[i].getMessage());
                sleep(Light.values()[i].getDuration() * 1000L);
                i++;
            }
           input --;
        }

    }
}
