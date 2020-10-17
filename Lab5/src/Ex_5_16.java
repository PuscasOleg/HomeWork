/* One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For example, if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.*/
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
