package person;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person("John", "123 Main St", "555-555-5555", "Tq4mz@example.com");
        System.out.println(person);
        System.out.println();
        System.out.println(person.details());

        Student student = new Student("student", "kalanki", "123456", "s1@test.com", StudentStatus.FRESHMAN);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(student.details());

        Employee employee  =  new Employee("employee1", "naxal", "9860111111", "e1@test.com", "office", 1000, new MyDate(2022, 1, 1));
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(employee.details());

        Faculty faculty = new Faculty("faculty", "baneshwor", "9860111112", "f1@test.com", "office", 2000, new MyDate(2022, 1, 1), "9-10", "professor");
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(faculty.details());

        Staff staff = new Staff("staff", "kathmandu", "9860111113", "s1@test.com", "office", 3000, new MyDate(2022, 1, 1), "manager");
        System.out.println();
        System.out.println(staff);
        System.out.println();
        System.out.println(staff.details());

        PartTime partTime = new PartTime("partTime", "kathmandu", "9860111114", "p1@test.com", "office", 0, new MyDate(2022, 1, 1), "manager");
        partTime.setHours(400);
        partTime.setHourlyWage(20);
        System.out.println();
        System.out.println(partTime);
        System.out.println();
        System.out.println(partTime.details());

        FullTime fullTime = new FullTime("fullTime", "kathmandu", "9860111115", "f1@test.com", "office", 4440, new MyDate(2022, 1, 1), "manager");
        System.out.println();
        System.out.println(fullTime);
        System.out.println();
        System.out.println(fullTime.details());
    }
}
