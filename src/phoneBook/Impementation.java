package phoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Impementation implements Interface {
    Scanner scanner = new Scanner(System.in);
    CheckUsingRegex checkUsingRegex = new CheckUsingRegex();
    ArrayList<Person> contact = new ArrayList<>();

    @Override
    public void addNewContact() {
        ArrayList<String> numbers = new ArrayList<>();
        String firstName = "";
        String lastName = "";
        String emailAddress = "---";
        String phoneNumber = "";
        System.out.println("Enter the name of the Person");
        System.out.println("Enter first Name: ");
        firstName = scanner.next();
        if (checkUsingRegex.isFirstName(firstName)) {
            System.out.println("Enter Last Name: ");
            lastName = scanner.next();
            if (checkUsingRegex.isLastName(lastName)) {

            }
        }
    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }

    @Override
    public void viewAllContact() {

    }

    @Override
    public void exit() {

    }
}
