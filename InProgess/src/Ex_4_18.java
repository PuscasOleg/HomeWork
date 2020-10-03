
class BankAccount {
    int accountNumber;
    int balanceMounthBeginning;
    int totalChargerItemss;
    int totalAppliedCredits;
    int creditLimit;
    int newBalance;
    public BankAccount(int accountNumber, int balanceMounthBeginning, int totalChargerItemss, int totalAppliedCredits, int creditLimit) {
        setaccountNumber(accountNumber);
        setBalanceMounthBeginning(balanceMounthBeginning);
        settotalChargerItemss(totalChargerItemss);
        setCreditLimit(creditLimit);
        settotalAppliedCredits(totalAppliedCredits);



    }

    




    public int getaccountNumber() {
        return accountNumber;
    }

    public void setaccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public int getBalanceMounthBeginning() {
        return balanceMounthBeginning;
    }

    public void setBalanceMounthBeginning(int balanceMounthBeginning) {
        this.balanceMounthBeginning = balanceMounthBeginning;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int gettotalAppliedCredits() {
        return totalAppliedCredits;
    }

    public void settotalAppliedCredits(int totalAppliedCredits) {
        if (this.totalAppliedCredits + totalAppliedCredits <= creditLimit){
            this.totalAppliedCredits += totalAppliedCredits;
        }

    }

    public int gettotalChargerItemss() {
        return totalChargerItemss;
    }

    public void settotalChargerItemss(int totalChargerItemss) {
        this.totalChargerItemss += totalChargerItemss;
    }

    public void setNewBalance(int newBalance) {
        this.newBalance = newBalance;
    }

    public int getNewBalance() {
        return newBalance;
    }


    public int getBalance() {
        if (totalAppliedCredits < 0) {
            totalAppliedCredits = 0;
        }
        if (totalChargerItemss < 0) {

            totalChargerItemss = 0;
        }
        return getBalanceMounthBeginning() + gettotalChargerItemss() - gettotalChargerItemss();
    }

    public boolean Balance() {
        return (getNewBalance() > getCreditLimit()) ? false : true;

    }





    /*public int Balance() {
        if (totalAppliedCredits < 0) {
            totalAppliedCredits = 0;
        }
        if (totalChargerItemss < 0) {

            totalChargerItemss = 0;
        }


        if (newBalance < 0) {
            System.out.println(" \"Credit limit exceeded");
        } else {
            System.out.println("Beginning balance:" + balanceMounthBeginning + "newBalance:" + newBalance + "Charger:" + totalChargerItemss + "Credits:" + totalAppliedCredits);
        }

        return 0;
    }*/

    /*public void Calculation() {
        newBalance = balanceMounthBeginning + totalChargerItemss - totalAppliedCredits;
    }

    public void
    Balance() {


        if (newBalance < 0) {
            System.out.println(" \"Credit limit exceeded");

        } else {
            System.out.println("Beginning balance:" + balanceMounthBeginning + "newBalance:" + newBalance + "Charger:" + totalChargerItemss + "Credits:" + totalAppliedCredits);
        }

    }*/
}


public class Ex_4_18 {
    public static void main(String[] args) {


        BankAccount firstBanckAccount = new BankAccount(1, 0, 100, 50, 500);
        System.out.println(firstBanckAccount.getaccountNumber() + " " + firstBanckAccount.gettotalAppliedCredits() + " " + firstBanckAccount.gettotalChargerItemss() + " " + firstBanckAccount.getBalanceMounthBeginning() + " " + firstBanckAccount.getCreditLimit());
        firstBanckAccount.settotalChargerItemss(200);
        firstBanckAccount.settotalChargerItemss(100);
        System.out.println(firstBanckAccount.gettotalChargerItemss());


    }
}
