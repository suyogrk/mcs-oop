package person;

public class Staff extends Employee{
    protected String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString()
    {
        return "Class name: Staff" +
                "\n Person Name: " + this.name;
    }

    public String details()
    {
        return "Staff Details"
                + "\nName: " + this.name
                + "\nAddress: " + this.address
                + "\nPhone Number: " + this.phoneNumber
                + "\nEmail Address: " + this.emailAddress
                + "\nOffice: " + this.office
                + "\nSalary: " + this.salary
                + "\nDate Hired: " + this.dateHired
                + "\nTitle: " + this.title;
    }
}
