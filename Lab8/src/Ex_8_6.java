class SavingAccount{


    static int AnnualInterestRate;
    private  int saveBalance;


    SavingAccount(int annualInterestRate, int savingBalance) {
        if (annualInterestRate > 0 && savingBalance > 0) {
            SavingAccount.AnnualInterestRate = annualInterestRate;
            this.saveBalance = savingBalance;
        }
    }

    public void setSavingBalance(int savingBalance) {
        if (savingBalance > 0) {
            this.saveBalance = savingBalance;
        } else {
            System.out.println("Anything is wrong with saving balance");
        }
    }

    public void calculateMonthlyInterest() {
        saveBalance = saveBalance + (saveBalance * AnnualInterestRate) / 12;
    }

    static void modifyInterestRate(int value) {
        SavingAccount.AnnualInterestRate = value;
    }



    public static int getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public int getSavingBalance() {
        return saveBalance;
    }
}



public class Ex_8_6 {

    public static void main(String[] args) {

        SavingAccount account1 = new SavingAccount(10, 20000);
        SavingAccount account2 = new SavingAccount(50, 100000);

        System.out.println("Depositor's monthly account1: " + account1.getSavingBalance());
        System.out.println("Depositor's monthly account2: " + account2.getSavingBalance());

        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();
        System.out.println("-------------------------------------------------------------");


        System.out.println("Depositor's monthly account1: " + account1.getSavingBalance());
        System.out.println("Depositor's monthly account2: " + account2.getSavingBalance());

        SavingAccount.modifyInterestRate(4);

        account1.calculateMonthlyInterest();
        account2.calculateMonthlyInterest();

        System.out.println("-------------------------------------------------------------");
        System.out.println("Depositor's monthly account1: " + account1.getSavingBalance());
        System.out.println("Depositor's monthly account2: " + account2.getSavingBalance());

    }
}
