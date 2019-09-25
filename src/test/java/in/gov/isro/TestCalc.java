package in.gov.isro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		calculator calc = new calculator();
		int result = calc.add(5, 5); 
		assertEquals(10, result);
	}
	@Test
	public void testmulti() {
		calculator calc = new calculator();
		int result = calc.multi(5, 5); 
		assertEquals(25, result);
	}

	public void testsubtract() {
		calculator calc = new calculator();
		int result = calc.multi(5, 3); 
		assertEquals(2, result);
	}
	
	public void testdiv() {
		calculator calc = new calculator();
		int result = calc.divide(10, 2); 
		assertEquals(5, result)
	}
}
