package subtractionTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import subtraction.CalculateSubtraction;

public class CalculateSubtractionTest {

	public CalculateSubtraction sub = new CalculateSubtraction();
	
	// Basic test =======================
	
	@Test
	public void subtractOne() {
		
		double value = sub.subtract(40,50);
		assertEquals(value, -10);
	}
	
	
	@Test
	public void subtractTwo() {
		
		double result = sub.subtract(9.9,8.9);
		assertNotEquals(result, 1.9);
	}
	
	@Test
	public void subtractThree() {
		
		double value = sub.subtract(40,50);
		assertEquals(value, -20);
	}
	
	@Test
	public void subtractFour() {
		
		double result = sub.subtract(9.9,8.9);
		assertNotEquals(result, 1.9);
	}
	
	@Test
	public void sampleFive() {
		assertTrue(true);
	}
	
	@Test
	public void subtractSix() {
		
		double value = sub.subtract(40,50);
		assertEquals(value, -11);
	}
	
	@Test
	public void subtractSeven() {
		
		double value = sub.subtract(40,50);
		assertEquals(value, -10);
	}
}
