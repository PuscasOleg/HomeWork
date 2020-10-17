
import java.util.Scanner;

public class Ex_5_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter five numbers in Array between 1 and 30: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = 1; k <= arr[j]; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
