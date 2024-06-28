package person;

public class PartTime extends Staff {
    protected double hourlyWage;
    protected int hours;

    public PartTime(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if(hourlyWage  < 0) {
            System.out.println("Hourly wage cannot be less than 0.");
        }
        this.hourlyWage = hourlyWage;
        this.salary = hourlyWage * hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0) {
            System.out.println("Worked hours cannot be less than 0");
        }
        this.hours = hours;
        this.salary = this.hours * this.hourlyWage;
    }

    public String toString() {
        return "Class name: Part Time" +
                "\n Person Name: " + this.name;
    }

    public String details() {
        return "Full Time Staff Details"
                + "\nName: " + this.name
                + "\nAddress: " + this.address
                + "\nPhone Number: " + this.phoneNumber
                + "\nEmail Address: " + this.emailAddress
                + "\nOffice: " + this.office
                + "\nWorked Hours: " + this.hours
                + "\nHourly rate : " + this.hourlyWage
                + "\nSalary: " + this.salary
                + "\nDate Hired: " + this.dateHired
                + "\nTitle: " + this.title;

    }
}
