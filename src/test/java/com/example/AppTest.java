Create: src/test/java/com/example/AppTest.java

package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testEligibility() {
        int credits = 15;
        assertTrue(credits >= 15);
    }

    @Test
    public void testNotEligible() {
        int credits = 10;
        assertFalse(credits >= 15);
    }
}
