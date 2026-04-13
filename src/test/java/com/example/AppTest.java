package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testEligibility() {
        int credits = 15;
        assertTrue("Student should be eligible with 15 credits", credits >= 15);
    }

    @Test
    public void testNotEligible() {
        int credits = 10;
        assertFalse("Student should not be eligible with 10 credits", credits >= 15);
    }
}
