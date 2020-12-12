public class Employee {

    private String firstName;
    private String lastName;
    private String SecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSecurityNumber() {
        return SecurityNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setSecurityNumber(String securityNumber) {
        this.SecurityNumber = securityNumber;
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + "\n"
                + "Last name: " + getLastName() + "\n"
                + "Social security number: " + getSecurityNumber();
    }
}