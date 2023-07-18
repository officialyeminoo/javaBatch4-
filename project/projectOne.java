import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        // scanner Obj
        Scanner userInput = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Choose your number:");
            System.out.println("1. Calculation Arithmetic");
            System.out.println("2. Calculation Factorial");
            System.out.println("3. Temperature change");
            System.out.println("4. Exit");
            choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Calculation Arithmetic");
                    // Perform arithmetic calculation
                    // Add your arithmetic calculation code here
                    break;
                case 2:
                    System.out.println("Calculation Factorial");
                    // Perform factorial calculation
                    // Add your factorial calculation code here
                    break;
                case 3:
                    System.out.println("Temperature change");
                    // Perform temperature change calculation
                    // Add your temperature change calculation code here
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from 1 to 4.");
            }

            System.out.println(); // Print a blank line for spacing
        } while (choice != 4);
    }
}