package org.example.day19;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_REGEX, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static void main(String[] args){
        UserRegistration ur = new UserRegistration();
        System.out.println(ur.validateEmail("prabhakran@gmail.com"));
    }
}
