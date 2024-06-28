package saloon;

public class VisitTest {

    public static void main(String[] args) {
        Customer customer = new Customer("John");
        customer.setMembership(Customer.PREMIUM);

        Visit visit = new Visit(customer);
        visit.setProductsPurchased(100);
        visit.setServicesPurchased(1000);
        visit.calculateTotalBill();
        System.out.println(visit);
    }
}
