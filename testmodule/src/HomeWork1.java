import java.util.Scanner;

public class HomeWork1 {
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

        int sum ;
        int difference ;
        int product ;
        double division ;
        sum = number1 + number2;
        System.out.println("Sum" + sum);
        if (number1 == 0 || number2 == 0) {
            System.out.println("Нельзя делить на ноль");
        } else {
            division = number1 / number2;
            System.out.println("Division:" + division);
        }
        product = number1 * number2;
        System.out.println("Product:" + product);
        difference = number1 - number2;
        System.out.println("Difference:" + difference);





    }
}
