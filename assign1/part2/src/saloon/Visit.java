package saloon;

public class Visit {
    protected Customer customer;
    protected double servicesPurchased;
    protected double productsPurchased;
    protected double totalBill;

    public Visit(Customer customer)
    {
        this.customer = customer;
        this.servicesPurchased = 0.0;
        this.productsPurchased =  0.0;
        this.totalBill = 0.0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getServicesPurchased() {
        return servicesPurchased;
    }

    public void setServicesPurchased(double servicesPurchased) {
        this.servicesPurchased = servicesPurchased;
    }

    public double getProductsPurchased() {
        return productsPurchased;
    }

    public void setProductsPurchased(double productsPurchased) {
        this.productsPurchased = productsPurchased;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void calculateTotalBill()
    {
        double serviceDiscount = Discount.getServiceDiscountRate(this.customer.getMembership());
        double productDiscount = Discount.getProductDiscountRate(this.customer.getMembership());

        double serviceBill = this.servicesPurchased - (this.servicesPurchased * serviceDiscount);
        double productBill = this.productsPurchased - (this.productsPurchased * productDiscount);

        this.totalBill = serviceBill + productBill;
    }

    public String toString()
    {
        return "Visit details"
                + "\n Customer: " + this.customer.getName()
                + "\n Services Purchased: " + this.servicesPurchased
                + "\n Products Purchased: " + this.productsPurchased
                + "\n Total Bill: " + this.totalBill;
    }
}
