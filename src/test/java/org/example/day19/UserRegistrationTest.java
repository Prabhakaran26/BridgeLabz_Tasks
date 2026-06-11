package org.example.day19;

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
        assertEquals(true,userRegistration.validateFirstName("Prabha"));
    }

    @Test
    public void testInvalidFirstName() {

        assertEquals(true,userRegistration.validateFirstName("pr"));
    }

    @Test
    public void testValidLastName() {
        assertEquals(true,userRegistration.validateLastName("Kumar"));
    }

    @Test
    public void testInvalidLastName() {
        assertEquals(true,userRegistration.validateLastName("kumar"));
    }

    @Test
    public void testValidEmail() {
        assertEquals(true,userRegistration.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    public void testInvalidEmail() {
        assertEquals(true,userRegistration.validateEmail("abc@.com"));
    }

    @Test
    public void testValidMobile() {
        assertEquals(true,userRegistration.validateMobile("91 9919819801"));
    }

    @Test
    public void testInvalidMobile() {
        assertEquals(true,userRegistration.validateMobile("919919819801")); // Missing space
    }

    @Test
    public void testValidPassword() {
        assertEquals(true,userRegistration.validatePassword("Secret1!"));
    }

    @Test
    public void testInvalidPassword() {
        assertEquals(true,userRegistration.validatePassword("secret1!")); // Missing Uppercase
    }
}
