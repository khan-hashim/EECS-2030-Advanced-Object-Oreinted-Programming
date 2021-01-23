package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to Utilities.testGetGeometricSequence
	 */
	@Test
	public void testGetGeometricSequence_01() {
		String result = Utilities.getGeometricSequence(44, 0);
		assertEquals("[44][0][0][0][0] has average 8.8", result);
	}
	
	@Test
	public void testGetGeometricSequence_02() {
		String result = Utilities.getGeometricSequence(23, 1);
		assertEquals("[23][23][23][23][23] has average 23.0", result);
	}
	
	@Test
	public void testGetGeometricSequence_03() {
		String result = Utilities.getGeometricSequence(6, 2);
		assertEquals("[6][12][24][48][96] has average 37.2", result);
	}
	
	@Test
	public void testGetGeometricSequence_04() {
		String result = Utilities.getGeometricSequence(7, 3);
		assertEquals("[7][21][63][189][567] has average 169.4", result);
	}
	
	/*
	 * Tests related to Utilities.getBMI
	 */
	@Test
	public void testGetBMI_01() {
		double result = Utilities.getBMI(99.8, 62.99);
		assertEquals(17.7, result, 0.1);
	}
	
	@Test
	public void testGetBMI_02() {
		double result = Utilities.getBMI(129.4, 64.38);
		assertEquals(21.9, result, 0.1);
	}
	
	@Test
	public void testGetBMI_03() {
		double result = Utilities.getBMI(177.7, 66.92);
		assertEquals(27.9, result, 0.1);
	}
	
	@Test
	public void testGetBMI_04() {
		double result = Utilities.getBMI(223.5, 68.77);
		assertEquals(33.2, result, 0.1);
	} 
	
	/*
	 * Tests related to Utilities.getTimeConversion
	 */
	@Test
	public void testGetTimeConversion_01() {
		String result = Utilities.getTimeConversion(0);
		assertEquals("0 days 0 hours 0 minutes 0 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_02() {
		String result = Utilities.getTimeConversion(34);
		assertEquals("0 days 0 hours 0 minutes 34 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_03() {
		String result = Utilities.getTimeConversion(1 * 60);
		assertEquals("0 days 0 hours 1 minutes 0 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_04() {
		String result = Utilities.getTimeConversion(57 * 60 + 19);
		assertEquals("0 days 0 hours 57 minutes 19 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_05() {
		String result = Utilities.getTimeConversion(59 * 60 + 58);
		assertEquals("0 days 0 hours 59 minutes 58 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_06() {
		String result = Utilities.getTimeConversion(4 * 60 * 60);
		assertEquals("0 days 4 hours 0 minutes 0 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_07() {
		String result = Utilities.getTimeConversion(60 * 60 + 27);
		assertEquals("0 days 1 hours 0 minutes 27 seconds", result);
	}  
	
	@Test
	public void testGetTimeConversion_08() {
		String result = Utilities.getTimeConversion(16 * 60 * 60 + 27 * 60);
		assertEquals("0 days 16 hours 27 minutes 0 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_09() {
		String result = Utilities.getTimeConversion(9 * 60 * 60 + 47 * 60 + 7);
		assertEquals("0 days 9 hours 47 minutes 7 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_10() {
		String result = Utilities.getTimeConversion(24 * 60 * 60);
		assertEquals("1 days 0 hours 0 minutes 0 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_11() {
		String result = Utilities.getTimeConversion(2 * 24 * 60 * 60 + 17);
		assertEquals("2 days 0 hours 0 minutes 17 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_12() {
		String result = Utilities.getTimeConversion(3 * 24 * 60 * 60 + 49 * 60);
		assertEquals("3 days 0 hours 49 minutes 0 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_13() {
		String result = Utilities.getTimeConversion(4 * 24 * 60 * 60 + 23 * 60 * 60 + 59);
		assertEquals("4 days 23 hours 0 minutes 59 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_14() {
		String result = Utilities.getTimeConversion(5 * 24 * 60 * 60 + 59 * 60 + 59);
		assertEquals("5 days 0 hours 59 minutes 59 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_15() {
		String result = Utilities.getTimeConversion(6 * 24 * 60 * 60 + 19 * 60 * 60 + 47 * 60 + 17);
		assertEquals("6 days 19 hours 47 minutes 17 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_16() {
		String result = Utilities.getTimeConversion(20 * 24 * 60 * 60 + 23 * 60 * 60 + 60 * 60 + 19);
		assertEquals("21 days 0 hours 0 minutes 19 seconds", result);
	}
	
	@Test
	public void testGetTimeConversion_17() {
		String result = Utilities.getTimeConversion(20 * 24 * 60 * 60 + 24 * 60 * 60 + 60 * 60 + 19);
		assertEquals("21 days 1 hours 0 minutes 19 seconds", result);
	}
}
