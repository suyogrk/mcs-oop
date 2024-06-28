package person;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    public Person() {
    }

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "Class name: Person" +
                "\n Person Name: " + this.name;
    }

    public String details() {
        return "Person Details"
                + "\nName: " + this.name
                + "\nAddress: " + this.address
                + "\nPhoneNumber: " + this.phoneNumber
                + "\nEmailAddress: " + this.emailAddress;
    }
}
