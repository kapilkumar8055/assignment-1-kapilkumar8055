package phoneBook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUsingRegex {
    public boolean isFirstName(String firstName) {
        Pattern pattern = Pattern.compile("([A-z]{3,15})");
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }
}
