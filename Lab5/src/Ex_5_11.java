/*Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.*/


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;


public class Ex_5_11 {
    public static void main(String[] args) {

        int  minValue = 0;
        System.out.print("Enter count of values: ");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt((20 - 1) + 1) + 1;
        }
        minValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

            if(arr[i] < minValue){
                minValue = arr[i];
            }

        }


        System.out.println( "Smallest of several integers"+minValue);
    }
}
