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
        assertTrue(userRegistration.validateFirstName("Prabha"));
    }

    @Test
    public void testInvalidFirstName() {
        assertFalse(userRegistration.validateFirstName("pr")); // Too short & lowercase
    }
}
