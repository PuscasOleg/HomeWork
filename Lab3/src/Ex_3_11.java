

class Account {
    private String name; // instance variable
    private double balance;

    public void withdraw(double balance) {
        if (balance > this.balance) {
            System.out.println("Withdrawal amount exceeded account balance");
        } else {
            this.balance -= balance;
        }


    }

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        if (balance > 0.0) {
            this.balance = balance;
        }
    }


    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }
}

public class Ex_3_11 {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green:", 50.00);
        Account account2 = new Account("John Blue:", 8.53);


        System.out.println(account1.getName() + account1.getBalance());

        account2.withdraw(10);
        System.out.println(account2.getBalance());


    }
}





