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
}
