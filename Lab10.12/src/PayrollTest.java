import java.util.Calendar;
/*

Modify the payroll system of Figs. 10.4–10.9 to include private instance variable birthDate in class Employee. Use class Date of Fig. 8.7 to represent an employee’s birthday. Add get methods to class Date. Assume that payroll is processed once per month.
        Create an array of Employee variables to store references to the various employee objects. In a loop,
        calculate the payroll for each Employee (polymorphically), and add a $100.00 bonus to the person’s
        payroll amount if the current month is the one in which the Employee’s birthday occurs.
*/

public class PayrollTest {
    public static void main(String[] args) {

        int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);

        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Tom", "Holland", "12-12-12",
                650.0f, 9, 4, 2000);
        employees[1] = new HourlyEmployee("Toni", "Stark", "21-21-21",
                20.5f, 25.0f, 10, 25, 2010);
        employees[2] = new CommissionEmployee("Spider", "Man", "33-33-33",
                9000.0f, .05f, 11, 20, 2005);
        employees[3] = new BasePlusCommissionEmployee("Tor", "Miolner", "44-44-44",
                7500.0f, .06f, 250.0f, 12, 9, 2003);

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10f * employee.getBaseSalary());

                System.out.printf("new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary());
            }

            System.out.printf("earned $%,.2f\n\n",
                    (currentEmployee.getBirthDate().getMonth() == currentMonth) ?
                            currentEmployee.earnings() + 100.0f : currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d is a %s\n", j, employees[j].getClass().getName());
        }
    }
}