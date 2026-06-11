package org.example.day19;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_REGEX = "^[A-Z][a-zA-Z]{2,}$";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_REGEX, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_REGEX, lastName);
    }

    public static void main(String[] args){
        UserRegistration ur = new UserRegistration();
        System.out.println(ur.validateFirstName("Prabhakaran"));
    }
}
