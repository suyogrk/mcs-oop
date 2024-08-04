//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        r.setWidth(5);
        r.setLength(10);
        System.out.println("Width " + r.getWidth());
        System.out.println("Length " + r.getLength());
        System.out.println("Area " + r.getArea());
        System.out.println("Perimeter " + r.getPerimeter());
        System.out.println(r);

        Employee e = new Employee(1, "Ram", "Sharma", 10000 );
        System.out.println();
        System.out.println("Id " + e.getId());
        System.out.println("Name " + e.getName());
        System.out.println("Salary " + e.getSalary());
        e.raiseSalary(10);
        System.out.println("Raised Salary " + e.getSalary());
        System.out.println(e);

        InvoiceItem i = new InvoiceItem("123", "abc", 10, 100);
        System.out.println();
        System.out.println("ID " + i.getID());
        System.out.println("Description " + i.getDesc());
        System.out.println("Quantity " + i.getQty());
        System.out.println("Unit Price " + i.getUnitPrice());
        System.out.println("Total " + i.getTotal());
        System.out.println(i);

        Account a1 = new Account("123", "Ram");
        Account a2 = new Account("123", "Ram");
        System.out.println();
        System.out.println("ID " + a1.getID());
        System.out.println("Name " + a1.getName());
        System.out.println("Balance " + a1.getBalance());
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}