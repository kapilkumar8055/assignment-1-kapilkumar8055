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
                char result;
                do {
                    System.out.println("Enter your Phone Number");
                    phoneNumber = scanner.next();
                    if (checkUsingRegex.isphoneNumber(phoneNumber)) {
                        numbers.add(phoneNumber);
                    } else {
                        System.out.println(".....Phone Number is not valid.....");
                        break;
                    }
                    System.out.println("Would you like to add another contact number? (y/n): ");
                    result = scanner.next().toLowerCase().charAt(0);
                } while (result == 'y');
                System.out.println("Would you like to add email address? (y/n): ");
                char result1 = scanner.next().toLowerCase().charAt(0);
                if (result1 == 'y') {
                    System.out.println("Enter Email Address");
                    emailAddress = scanner.next();
                    if (checkUsingRegex.isEmailAddress(emailAddress)) {
                        System.out.println("Email Address:  " + emailAddress);
                    }
                }

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
