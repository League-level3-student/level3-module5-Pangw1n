package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(128, RecursionMath.recursiveMultiplication(16, 8));
        assertEquals(100, RecursionMath.recursiveMultiplication(100, 1));
        assertEquals(80, RecursionMath.recursiveMultiplication(4, 20));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        assertEquals(3, RecursionMath.recursiveDivision(12, 4));
        assertEquals(10, RecursionMath.recursiveDivision(100, 10));
        assertEquals(3, RecursionMath.recursiveDivision(16, 5));
        assertEquals(9, RecursionMath.recursiveDivision(99, 10));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(64, RecursionMath.recursivePower(8, 2));
        assertEquals(144, RecursionMath.recursivePower(12, 2));
        assertEquals(125, RecursionMath.recursivePower(5, 3));
        assertEquals(81, RecursionMath.recursivePower(3, 4));
    }
}
