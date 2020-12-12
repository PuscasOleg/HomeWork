public class ComissionEmployee extends Employee {

    private double grossSales, commissionRate;

    public ComissionEmployee(String firstName,
                              String lastName,
                              String SecurityNumber,
                              double grossSales,
                              double commissionRate) {

        super(firstName, lastName, SecurityNumber);

        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public double getGrossSales() {
        return grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }



    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be between > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGross sales: " + getGrossSales() + "\n"
                + "Commission rate: " + getCommissionRate();
    }
}