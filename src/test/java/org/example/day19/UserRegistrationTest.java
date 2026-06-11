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
}
