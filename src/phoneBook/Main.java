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
            switch (Choice) {
                case 1:
                    System.out.println("You have chosen to add a new contact: ");
                    impementation.addNewContact();
                    break;
                case 2:
                    System.out.println("You have chosen to view all contacts:");
                    impementation.viewAllContact();
                    break;
                case 3:
                    System.out.println("You have chosen to search any contact:");
                    impementation.searchContact();
                    break;
                case 4:
                    System.out.println("You have chosen to delete any contact:");
                    impementation.deleteContact();
                    break;
                case 5:
                    System.out.println("You have chosen to exit:");
                    impementation.exit();
                    System.out.println("----THANK YOU----");
                    break;
                default:
                    System.out.println("please enter your choice wisely ");
                    break;
            }
        }
        while (cases);
    }
}
