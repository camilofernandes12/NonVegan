package camilo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class nonveganTest {
	@Test
    public void testMultiply() {
        nonvegan nonVegan = new nonvegan();
        int expected=125;
        int actual= nonVegan.multiply(5,5,5);
        assertEquals(expected, actual);
    }
	
	@Test
    public void testDivide() {
        nonvegan nonVegan = new nonvegan();
        int expected=5;
        int actual=nonVegan.divide(10,2);
        assertEquals(expected, actual);;
    }
}
