import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] marks = new int[3][3];

        int choice;

        while (true) {

            System.out.println("\n--- Student Marks System ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Search Marks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {

                for (int i = 0; i < 3; i++) {

                    System.out.println("Enter marks for Student " + (i + 1));

                    for (int j = 0; j < 3; j++) {

                        System.out.print("Subject " + (j + 1) + ": ");
                        marks[i][j] = input.nextInt();
                    }
                }

                System.out.println("Marks entered successfully.");

            } else if (choice == 2) {

                System.out.println("\nStudent Marks:");

                for (int i = 0; i < 3; i++) {

                    System.out.print("Student " + (i + 1) + ": ");

                    for (int j = 0; j < 3; j++) {

                        System.out.print(marks[i][j] + " ");
                    }

                    System.out.println();
                }

            } else if (choice == 3) {

                System.out.print("Enter marks to search: ");
                int value = input.nextInt();

                boolean found = false;

                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 3; j++) {

                        if (marks[i][j] == value) {

                            System.out.println(
                                "Marks found at Student " + (i + 1)
                                + ", Subject " + (j + 1)
                            );

                            found = true;
                        }
                    }
                }

                if (!found) {
                    System.out.println("Marks not found.");
                }

            } else if (choice == 4) {

                System.out.println("Program ended.");
                break;

            } else {

                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}