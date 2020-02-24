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
                } else {
                    System.out.println("Email Address:  " + emailAddress);
                }
                if (checkUsingRegex.isFirstName(firstName) && checkUsingRegex.isEmailAddress(emailAddress) && checkUsingRegex.isLastName(lastName) && checkUsingRegex.isphoneNumber(phoneNumber)) {
                    Person person = new Person(firstName, lastName, numbers, emailAddress);
                    contact.add(person);
                } else {
                    System.out.println("\n..Please Enter Correct Name , PhoneNumber , email id - Syntax Error!..");
                }
            } else {
                System.out.println("..Syntax Error!..");
            }
        } else {
            System.out.println("..Syntax Error!..");
        }
    }

    @Override
    public void deleteContact() {
        int no = 1;
        if (contact.size() > 0) {
            System.out.println("Here are all your Contacts : ");
            for (int s = 0; s < contact.size(); s++) {
                System.out.println(no + "." + contact.get(s).getFirstName() + " " + contact.get(s).getLastName());
                no++;
            }
            int toDelete = scanner.nextInt();
            System.out.println("Press the number against the contact to delete it: " + toDelete);
            System.out.println(contact.get(toDelete - 1).getFirstName() + " " + contact.get(toDelete - 1).getLastName() + "'s " + "contact deleted from list!");
            contact.remove(toDelete - 1);
            contact.trimToSize();
            matched.trimToSize();
        } else {
            System.out.println("..........SORRY NO RESULTS FOUND............");
        }
    }

    @Override
    public void searchContact() {

    }

    @Override
    public void viewAllContact() {

    }

    @Override
    public void exit() {
        return;
    }
}
