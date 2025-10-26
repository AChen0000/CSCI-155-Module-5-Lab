import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int repeat; // repeating the program

        do {
            // Ask how many students
            System.out.print("How many students? ");
            int numStudents = input.nextInt();
            input.nextLine(); // clear newline

            String topStudent = "";
            double topScore = -1;

            // Loop through each student
            for (int i = 1; i <= numStudents; i++) {
                System.out.print("Enter student " + i + "'s name: ");
                String name = input.nextLine();

                System.out.print("Enter " + name + "'s score: ");
                double score = input.nextDouble();
                input.nextLine(); // clear newline

                if (score > topScore) {
                    topScore = score;
                    topStudent = name;
                }
            }

            System.out.println("\nThe student with the highest score is " + topStudent +
                               " with a score of " + topScore);

            // Ask if the user wants to repeat
            System.out.print("\nEnter 0 to exit or any other number to try again: ");
            repeat = input.nextInt();
            input.nextLine(); // clear newline

        } while (repeat != 0);

        System.out.println("Bye!");
        input.close();
    }
}



