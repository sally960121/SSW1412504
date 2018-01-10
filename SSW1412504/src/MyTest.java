import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	@Test
	public void testAdd() {
		MyCalc calc = new MyCalc();
		assertEquals(3, calc.add(1,2));
	}

	@Test
	public void testSubstract() {
		MyCalc calc = new MyCalc();
		assertEquals(2, calc.substract(5,3));
		assertEquals(-2,calc.substract(3,5));
	}

	@Test
	public void testMultiply() {
		MyCalc calc = new MyCalc();
		assertEquals(15,calc.multiply(3,5));
		
	}

}
