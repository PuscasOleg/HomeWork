import java.util.Scanner;

public class Ex_2_15 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        System.out.println("Enter first number:");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        System.out.println("You entered: " + number1);
        System.out.println("Enter second number:");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        System.out.println("You entered: " + number2);

        if (number1 > number2) {
            System.out.println("Number1 is larger than number2");
        } else if (number2 > number1) {
            System.out.println("Number2 is larger than number1");
        } else {
            System.out.println("These numbers are equal ");
        }

    }
}
