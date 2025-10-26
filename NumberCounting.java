import java.util.Scanner;

public class NumberCounting {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice; // to repeating the program

        do {
            int number;
            int positives = 0;
            int negatives = 0;
            int count = 0;
            double total = 0;

            System.out.print("Enter an integer, the input ends if it is 0: ");
            number = input.nextInt(); // first number input

            // if the first number is 0, no numbers were entered
            if (number == 0) {
                System.out.println("No numbers are entered except 0");
            } else {
                // process numbers until 0 is entered
                while (number != 0) {
                    if (number > 0) {
                        positives++;
                    } else {
                        negatives++;
                    }

                    total += number;
                    count++;

                    number = input.nextInt(); // read next number
                }

                double average = total / count;

                System.out.println("The number of positives is " + positives);
                System.out.println("The number of negatives is " + negatives);
                System.out.println("The total is " + total);
                System.out.println("The average is " + average);
            }

            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            choice = input.nextInt();

        } while (choice != 0);

        System.out.println("Bye!");
        input.close();
    }
}
