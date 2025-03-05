import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        int number = getNonNegativeInteger(); // get a non-negative integer from the user
        long factorial = calculateFactorial(number); // calculate the factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // display result
    }

    // method to get a non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a non-negative integer: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Invalid input. Please enter a non-negative integer.");
            }
        } while (number < 0); // Loop until a valid non-negative integer is entered
        return number;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        int factorial = 1; 
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
