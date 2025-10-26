import java.util.Scanner;

public class SquareArea {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side; // store the side of the square

        do {
            // Ask the user to enter the side of the square
            System.out.print("Enter the side of the square (enter 0 or a negative number to stop): ");
            side = input.nextDouble();

            //calculate and print the area
            if (side > 0) {
                double area = side * side;
                System.out.println("The area of the square is: " + area);
            } 
            // If the user enters 0 or a negative number, show a goodbye message
            else {
                System.out.println("Bye!");
            }

        } while (side > 0); // Repeat as long as the side greater than 0

        input.close(); // Close 
    }
}
