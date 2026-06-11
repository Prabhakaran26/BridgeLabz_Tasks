package org.example.day19;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9\\s]*[^a-zA-Z0-9\\s][a-zA-Z0-9\\s]*$).{8,}$";



    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_REGEX, lastName);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public boolean validateMobile(String mobile) {
        return Pattern.matches(MOBILE_REGEX, mobile);
    }

    public boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_REGEX, password);
    }

    public static void main(String[] args){
        UserRegistration ur = new UserRegistration();
        System.out.println(ur.validateEmail("prabhakran@gmail.com"));
    }
}
