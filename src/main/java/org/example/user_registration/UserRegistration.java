package org.example.user_registration;

import java.util.regex.Pattern;

class InvalidException extends Exception {
    public InvalidException(String message) {
        super(message);
    }
}

@FunctionalInterface
interface UserValidation {
    boolean validate(String input) throws InvalidException;
}

public class UserRegistration {

    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9\\s]*[^a-zA-Z0-9\\s][a-zA-Z0-9\\s]*$).{8,}$";

    public UserValidation validateFirstName = (firstName) -> {
        if (!Pattern.matches(NAME_REGEX, firstName)) {
            throw new InvalidException("Invalid First Name");
        }
        return true;
    };

    public UserValidation validateLastName = (lastName) -> {
        if (!Pattern.matches(NAME_REGEX, lastName)) {
            throw new InvalidException("Invalid Last Name");
        }
        return true;
    };

    public UserValidation validateEmail = (email) -> {
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new InvalidException("Invalid Email");
        }
        return true;
    };

    public UserValidation validateMobile = (mobile) -> {
        if (!Pattern.matches(MOBILE_REGEX, mobile)) {
            throw new InvalidException("Invalid Mobile");
        }
        return true;
    };

    public UserValidation validatePassword = (password) -> {
        if (!Pattern.matches(PASSWORD_REGEX, password)) {
            throw new InvalidException("Invalid Password");
        }
        return true;
    };

    public static void main(String[] args) throws InvalidException {
        UserRegistration ur = new UserRegistration();

        System.out.println(ur.validateFirstName.validate("Prabhakaran"));
    }
}