import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat; // repeat

        do {
            System.out.print("Enter a decimal number: ");
            int decimal = input.nextInt();

            if (decimal == 0) {
                System.out.println("Binary: 0");
            } else {
                int number = decimal;
                String binary = "";

                // Convert decimal to binary
                while (number > 0) {
                    int remainder = number % 2;
                    binary = remainder + binary; // add remainder to the front
                    number = number / 2;
                }

                System.out.println("Binary: " + binary);
            }

            // Ask if the user wants to convert another number
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();

        } while (repeat != 0);

        System.out.println("Bye!");
        input.close();
    }
}
