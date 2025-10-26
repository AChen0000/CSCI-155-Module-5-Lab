import java.util.Scanner;

public class PyramidPattern {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat; // to repeat

        do {
            // Ask the user for the number of lines
            System.out.print("Enter the number of lines (1 to 15): ");
            int lines = input.nextInt();

            // Check if the input is valid
            if (lines < 1 || lines > 15) {
                System.out.println("Something seems wrong! Please enter a number between 1 and 15.:");
            } else {
                // Create the pyramid
                for (int i = 1; i <= lines; i++) {
                    // Print decreasing numbers from i to 1
                    for (int j = i; j >= 1; j--) {
                        System.out.print(j + " ");
                    }
                    // Print increasing numbers from 2 to i
                    for (int j = 2; j <= i; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println(); // Move to next line
                }
            }

            // Ask if the user wants to make another pyramid
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();

        } while (repeat != 0);

        System.out.println("Bye!");
        input.close();
    }
}
