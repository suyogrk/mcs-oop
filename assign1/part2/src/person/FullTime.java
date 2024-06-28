package person;

public class FullTime extends Staff {
    public FullTime(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
    }

    public String toString()
    {
        return "Class name: Full Time" +
                "\n Person Name: " + this.name;
    }

    public String details()
    {
        return "Full Time Staff Details"
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
