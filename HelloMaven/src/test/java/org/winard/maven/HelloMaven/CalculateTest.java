package org.winard.maven.HelloMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	Calculate calc;
	
	@Test
	public void testAdd() {
		int a = 4;
		int b = 5;
		
		calc = new Calculate();
		int sum = calc.add(a, b);
		
		assertEquals(9,sum);
		
		
	}

}
