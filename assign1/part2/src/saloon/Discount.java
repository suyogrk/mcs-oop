package saloon;

public class Discount {
    public static double getServiceDiscountRate(String membershipType) {
        switch (membershipType) {
            case Customer.PREMIUM:
                return 0.20;
            case Customer.GOLD:
                return 0.15;
            case Customer.SILVER:
                return 0.10;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate(String membershipType) {
        // Flat 10% discount for all members
        if (membershipType.equals(Customer.PREMIUM) || membershipType.equals(Customer.GOLD) || membershipType.equals(Customer.SILVER)) {
            return 0.10;
        }

        return 0.0;
    }
}
