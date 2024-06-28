package person;

public class Student extends Person {
    protected StudentStatus studentStatus;

    public Student(String name, String address, String phoneNumber, String emailAddress, StudentStatus studentStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.studentStatus = studentStatus;
    }

    public StudentStatus getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(StudentStatus studentStatus) {
        this.studentStatus = studentStatus;
    }

    public String toString()
    {
        return "Class name: Student" +
                "\n Person Name: " + this.name;
    }

    public String details() {
        return "Student Details"
                + "\nName: " + this.name
                + "\nAddress: " + this.address
                + "\nPhone Number: " + this.phoneNumber
                + "\nEmail Address: " + this.emailAddress
                + "\nStudent Status: " + this.studentStatus;
    }
}
