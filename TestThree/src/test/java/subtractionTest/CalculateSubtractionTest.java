package subtractionTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import subtraction.CalculateSubtraction;

public class CalculateSubtractionTest {

	public CalculateSubtraction sub = new CalculateSubtraction();
	
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
}
