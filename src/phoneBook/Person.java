package phoneBook;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<String> ContactNumbers;
    private String email;

    public Person(String firstName, String lastName, ArrayList<String> contactNumbers, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        ContactNumbers = contactNumbers;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getContactNumbers() {
        return ContactNumbers;
    }

    public void setContactNumbers(ArrayList<String> contactNumbers) {
        ContactNumbers = contactNumbers;
    }
}