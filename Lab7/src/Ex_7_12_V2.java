import java.util.HashSet;
import java.util.Scanner;

public class Ex_7_12_V2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for (int i = 0; i < 5; ) {
            number = in.nextInt();
            if ((number >= 10) && (number <= 100)) {


                if (!(myHashSet.contains(number))) {
                    myHashSet.add(number);

                }
                i++;
            } else {
                System.out.println("Number must be between 10 and 100,enter again!");
            }


        }

        System.out.println(myHashSet);
    }
}
