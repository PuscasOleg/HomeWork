
/*In this chapter, you studied an inheritance hierarchy in which class
BasePlusCommissionEmployee inherited from class CommissionEmployee. However, not all types of
employees are CommissionEmployees. In this exercise, you’ll create a more general Employee superclass
that factors out the attributes and behaviors in class CommissionEmployee that are common to all Employees. The common attributes and behaviors for all Employees are firstName, lastName, socialSecurityNumber, getFirstName, getLastName, getSocialSecurityNumber and a portion of method
toString. Create a new superclass Employee that contains these instance variables and methods and a
constructor. Next, rewrite class CommissionEmployee from Section 9.4.5 as a subclass of Employee.
Class CommissionEmployee should contain only the instance variables and methods that are not declared in superclass Employee. Class CommissionEmployee’s constructor should invoke class Employee’s
constructor and CommissionEmployee’s toString method should invoke Employee’s toString method.
Once you’ve completed these modifications, run the CommissionEmployeeTest and BasePlusCommissionEmployeeTest apps using these new classes to ensure that the apps still display the same results for
a CommissionEmployee object and BasePlusCommissionEmployee object, respectively*/
public class CommissionEmployeeTest {
    public static void main(String[] args) {
        ComissionEmployee NewEmployee = new ComissionEmployee(
                "Vasia", "Pupkin", "88800-55535-2222", 5000, .01);

        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf("%s %s\n", "First name is", NewEmployee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", NewEmployee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", NewEmployee.getSecurityNumber());
        System.out.printf("%s %.2f\n", "Gross sales is", NewEmployee.getGrossSales());
        System.out.printf("%s %.2f\n", "Commission rate is", NewEmployee.getCommissionRate());

        NewEmployee.setGrossSales(300);
        NewEmployee.setCommissionRate(.2);

        System.out.printf("\n%s:\n\n%s\n",
                "Updated NewEmployee information obtained by toString", NewEmployee);
    }
}


