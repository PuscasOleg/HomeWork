import java.util.Scanner;

public class Ex_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write your  account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Write your balance at the beginning of the month: ");
        int balanceAtTheBeginningOfTheMonth = input.nextInt();
        System.out.println("Write your total of all items charged by the customer this month: ");
        int totalOfAllItemsChargedByTheCustomerThisMonth = input.nextInt();
        System.out.println("Write your total of all credits applied to the customer’s account this month: ");
        int totalOfAllCreditsAppliedToTheCustomersAccountThisMonth = input.nextInt();
        System.out.println("Write your allowed credit limit: ");
        int allowedCreditLimit = input.nextInt();


        double newBalance = balanceAtTheBeginningOfTheMonth + totalOfAllItemsChargedByTheCustomerThisMonth - totalOfAllCreditsAppliedToTheCustomersAccountThisMonth;
        if (totalOfAllCreditsAppliedToTheCustomersAccountThisMonth > allowedCreditLimit) {
            System.out.println("Credit limit exceeded!!!");
        } else {
            System.out.println(newBalance);
        }
    }
}