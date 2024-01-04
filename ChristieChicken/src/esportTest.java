import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class esportTest {

	@Test
	void addtest() {
		esport a1=new esport();
		int expected=4;
		int actual=a1.add(2, 2);
		assertEquals(expected,actual);
	}
	
	@Test
	void multest() {
		esport m1=new esport();
		int expected=8;
		int actual=m1.mul(2, 2, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	void divtest() {
		esport d1=new esport();
		int expected=2;
		int actual=d1.div(4,2);
		assertEquals(expected, actual);
	}

}
