package saloon;

public class Customer {
    public static final String GOLD = "Gold";
    public static final String SILVER = "Silver";
    public static final String PREMIUM = "Premium";
    public static final String NONE = "none";

    protected String name;
    protected String membership;

    public Customer(String name) {
        this.name = name;
        this.membership = NONE;
    }

    public Customer(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
}


