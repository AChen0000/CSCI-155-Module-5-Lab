import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat; // repeat
        do {
            // Ask the user to enter a string
            System.out.print("Enter a string: ");
            String text = input.nextLine();

            String reversed = "";

            // Loop through the string backwards
            for (int i = text.length() - 1; i >= 0; i--) {
                reversed += text.charAt(i);
            }

            // Display the reversed string
            System.out.println("Reversed string: " + reversed);

            // Ask if the user wants to reverse another string
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();
            input.nextLine(); 

        } while (repeat != 0);

        System.out.println("Bye!");
        input.close();
    }
}
