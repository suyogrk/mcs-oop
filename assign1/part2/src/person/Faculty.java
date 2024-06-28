package person;

public class Faculty extends Employee{
    protected String officeHours;
    protected String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours  = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString()
    {
        return "Class name: Faculty" +
                "\n Person Name: " + this.name;
    }

    public String details()
    {
        return "Faculty Details"
                + "\nName: " + this.name
                + "\nAddress: " + this.address
                + "\nPhone Number: " + this.phoneNumber
                + "\nEmail Address: " + this.emailAddress
                + "\nOffice: " + this.office
                + "\nSalary: " + this.salary
                + "\nDate Hired: " + this.dateHired
                + "\nOffice Hours : " + this.officeHours
                + "\nRank  : " + this.rank;
    }
}
