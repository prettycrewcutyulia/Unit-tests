package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CheckerTest {
    private final MyClass myClass = new MyClass();
    
    @Test
    public void testAdd() {
        int result = myClass.add(3, 4);
        assertEquals(7, result);

        result = myClass.add(-3, 4);
        assertEquals(1, result);

        result = myClass.add(-3, -4);
        assertEquals(-7, result);
    }

    @Test
    public void testSubtract() {
        int result = myClass.subtract(7, 3);
        assertEquals(4, result);

        result = myClass.subtract(-7, 3);
        assertEquals(-10, result);

        result = myClass.subtract(-7, -3);
        assertEquals(-4, result);
    }

    @Test
    public void testIsPositive() {
        boolean result = myClass.isPositive(7);
        assertTrue(result);

        result = myClass.isPositive(-7);
        assertFalse(result);

        result = myClass.isPositive(0);
        assertFalse(result);
    }
}
