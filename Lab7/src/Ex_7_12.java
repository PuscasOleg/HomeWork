import java.util.Scanner;

public class Ex_7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[5];

        int iter = 0;
        int x = 0;
        int num = 0;

        while (x < array.length) {
            System.out.print("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean digit = false;
                x++;

                for (int i = 0; i < array.length; i++) {
                    if (array[i] == num) {
                        digit = true;
                    }
                }

                if (!digit) {
                    array[iter] = num;
                    iter++;

                }

            } else {
                System.out.println("Number must be between 10 and 100,enter again!");
            }


        }


        for (int i = 0; i < x; i++) {
            if (array[i] != 0)
                System.out.print(array[i] + " ");
        }
        //System.out.println(x+"");
    }

}
