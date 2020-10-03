import java.util.Scanner;
import java.util.Random;


public class Ex_4_17 {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner in = new Scanner(System.in);
        int miles = 0;
        int gallons = 0;
        int rate = 0;
        int Rides =rand.nextInt(5);
        System.out.println(" Ridess:"+Rides);
        System.out.println("Enter miles:");
        miles = in.nextInt();
        System.out.println("Enter gallons:");
        gallons = in.nextInt();


        for (int i = 0; i < Rides; i++) {
            if (miles != -1 & gallons != -1) {

                rate = (miles / gallons) * 100;

            }else
            {
                System.out.println("you entered -1(stay home corona is coming)");
            }


        }
        System.out.println(rate);




    }
}
