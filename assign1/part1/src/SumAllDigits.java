import java.util.Scanner;

/**
 *
 */
public class SumAllDigits {
    public SumAllDigits() {
    }

    /**
     * This method calculates the sum of all digits of a number entered by the user.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        // Prompt user to enter a number between 0 and 1000
        do {
            do {
                sc.reset();
                System.out.print("Enter the number between 0 and 1000: ");
                n = sc.nextInt();
            } while (n < 0);
        } while (n > 1000);

        int sum = 0;
        // Calculate the sum of all digits of the entered number
        for (; n > 0; n /= 10) {
            sum += n % 10;
        }

        // Display the sum of all digits
        System.out.println("Sum of all digits: " + sum);
    }
}
