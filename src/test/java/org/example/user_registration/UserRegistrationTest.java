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
            boolean result = userRegistration.validateFirstName("Prabha");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid ,It throws an Exception!");
        }
    }

    @Test
    public void testInvalidFirstName() {
        try {
            userRegistration.validateFirstName("pr");
            fail("Invalid ,It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid First Name", e.getMessage());
        }
    }

    @Test
    public void testValidLastName() {
        try {
            boolean result = userRegistration.validateLastName("Kumar");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid ,It throws an Exception!");        }
    }

    @Test
    public void testInvalidLastName() {
        try {
            userRegistration.validateLastName("kumar");
            fail("Invalid ,It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid Last Name", e.getMessage());
        }
    }

    @Test
    public void testValidEmailSampleOne() {
        try {
            boolean result = userRegistration.validateEmail("abc.xyz@bl.co.in");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Email should be valid");
        }
    }

    @Test
    public void testValidEmailSampleTwo() {
        try {
            boolean result = userRegistration.validateEmail("abc-100@yahoo.com");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Email should be valid");
        }
    }

    @Test
    public void testInvalidEmail() {
        try {
            userRegistration.validateEmail(".abc@abc.com");
            fail("Invalid ,It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid Email Name", e.getMessage());
        }
    }

    @Test
    public void testValidMobile() {
        try {
            boolean result = userRegistration.validateMobile("91 9919819801");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid ,It throws an Exception!");
        }
    }

    @Test
    public void testInvalidMobile() {
        try {
            userRegistration.validateMobile("919919819801");
            fail("Invalid ,It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid Mobile", e.getMessage());
        }
    }

    @Test
    public void testValidPassword() {
        try {
            boolean result = userRegistration.validatePassword("Secret1!");
            assertEquals(true, result);
        } catch (InvalidException e) {
            fail("Invalid ,It throws an Exception!");
        }
    }

    @Test
    public void testInvalidPassword() {
        try {
            userRegistration.validatePassword("secret1!"); // Missing Capital Letter
            fail("Invalid ,It throws an Exception!");
        } catch (InvalidException e) {
            assertEquals("Invalid Password", e.getMessage());
        }
    }
}
