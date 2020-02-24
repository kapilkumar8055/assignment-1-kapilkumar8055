package phoneBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUsingRegex {
    public boolean isFirstName(String firstName) {
        Pattern pattern = Pattern.compile("([A-z]{3,15})");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean isLastName(String lastName) {
        Pattern pattern = Pattern.compile("([A-z]{4,15})");
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean isphoneNumber(String Number) {
        Pattern pattern = Pattern.compile("[9|8|7|6][0-9]{9}");
        Matcher matcher = pattern.matcher(Number);
        return matcher.matches();
    }

    public boolean isEmailAddress(String emailAddress) {
        //check email address of only GLA university
        Pattern pattern = Pattern.compile("(---)|(([A-Za-z]{3,15})\\.[a-z]{3,15}\\_([a-z]{2,4}[0-9]{2})@([a-z]{2,7})\\.([a-z]{1,5})\\.([a-z]{2,4}))");
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }

}