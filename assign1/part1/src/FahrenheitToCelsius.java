import java.util.Scanner;

public class FahrenheitToCelsius {
    public FahrenheitToCelsius() {
    }

    /**
     * This method converts Fahrenheit to Celsius.
     * It takes user input for the temperature in Fahrenheit and prints the equivalent temperature in Celsius.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter the degree in Fahrenheit
        System.out.print("Enter the degree in Fahrenheit:");

        // Read the Fahrenheit temperature input
        double fahrenheit = sc.nextDouble();

        // Calculate the equivalent temperature in Celsius
        double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;

        // Display the output in Celsius
        System.out.println("The output in celsius is: " + celsius);
    }
}
