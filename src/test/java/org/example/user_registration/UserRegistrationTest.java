package org.example.user_registration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    private UserRegistration userRegistration;

    @BeforeEach
    public void setUp() {
        userRegistration = new UserRegistration();
    }

    @Test
    public void testValidFirstName() {
        try {
            boolean result = userRegistration.validateFirstName.validate("Prabha");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid ,It throws an Exception");
        }
    }

    @Test
    public void testInvalidFirstName() {
        try {
            userRegistration.validateFirstName.validate("pr");
            fail("Invalid, It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid First Name", e.getMessage());
        }
    }

    @Test
    public void testValidLastName() {
        try {
            boolean result = userRegistration.validateLastName.validate("Kumar");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid,It throws an Exception!");
        }
    }

    @Test
    public void testInvalidLastName() {
        try {
            userRegistration.validateLastName.validate("kumar");
            fail("Invalid ,It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid Last Name", e.getMessage());
        }
    }

    @Test
    public void testValidEmailSampleOne() {
        try {
            boolean result = userRegistration.validateEmail.validate("abc.123@prabha.co.in");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Email should be valid");
        }
    }

    @Test
    public void testValidEmailSampleTwo() {
        try {
            boolean result = userRegistration.validateEmail.validate("prabha-26@google.com");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Email should be valid");
        }
    }

    @Test
    public void testInvalidEmail() {
        try {
            userRegistration.validateEmail.validate(".prabha@prabha.com");
            fail("Invalid,It throws an Exception");
        } catch (InvalidException e) {
            assertEquals("Invalid Email", e.getMessage());
        }
    }

    @Test
    public void testValidMobile() {
        try {
            boolean result = userRegistration.validateMobile.validate("91 9919819801");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid,It throws an Exception");
        }
    }

    @Test
    public void testInvalidMobile() {
        try {
            userRegistration.validateMobile.validate("919919819801");
            fail("Invalid, It throws an Exception");
        } catch (InvalidException e) {
            assertEquals("Invalid Mobile", e.getMessage());
        }
    }

    @Test
    public void testValidPassword() {
        try {
            boolean result = userRegistration.validatePassword.validate("Secret1!");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid,It throws an Exception");
        }
    }

    @Test
    public void testInvalidPassword() {
        try {
            userRegistration.validatePassword.validate("secret1!");
            fail("Invalid,It throws an Exception");
        } catch (InvalidException e) {
            assertEquals("Invalid Password", e.getMessage());
        }
    }
}