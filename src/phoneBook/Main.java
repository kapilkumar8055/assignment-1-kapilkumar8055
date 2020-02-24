package phoneBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cases = true;
        Impementation impementation = new Impementation();
        do {
            System.out.println("\n" + "Press 1 to add a new contact ");
            System.out.println("Press 2 to view all contacts ");
            System.out.println("Press 3 to search for a contact ");
            System.out.println("Press 4 to delete a contact ");
            System.out.println("Press 5 to exit program \n");
            System.out.println("Enter your Choice first! ");
            int Choice = scanner.nextInt();
        }
    }
}
