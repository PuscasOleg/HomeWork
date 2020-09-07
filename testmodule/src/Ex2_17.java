import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class Ex2_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter first number");
        arr[0] = in.nextInt();
        System.out.println("Enter second number");
        arr[1] = in.nextInt();
        System.out.println("Enter third number");
        arr[2] = in.nextInt();
        int product=arr[0]*arr[1]*arr[2];
        System.out.println("Product:"+product);
        int sum = IntStream.of(arr).sum();
        System.out.println("Sum:" + sum);
        int average = sum/arr.length;
        System.out.println("Average:"+average);

        OptionalInt max = IntStream.of(arr).max();
        System.out.println("Max number:" + max);
        OptionalInt min = IntStream.of(arr).min();
        System.out.println("Min number:" + min);


    }
}
