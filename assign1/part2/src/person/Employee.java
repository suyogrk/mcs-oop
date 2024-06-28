package person;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public String toString()
    {
        return "Class name: Employee" +
                "\n Person Name: " + this.name;
    }

    public String details()
    {
        return "Employee Details"
                + "\nName: " + this.name
                + "\nAddress: " + this.address
                + "\nPhone Number: " + this.phoneNumber
                + "\nEmail Address: " + this.emailAddress
                + "\nOffice: " + this.office
                + "\nSalary: " + this.salary
                + "\nDate Hired: " + this.dateHired;
    }
}
