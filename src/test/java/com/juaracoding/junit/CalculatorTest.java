package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculator;
	int a, b;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
		a = 10;
		b =5;
	}
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int expect = 15;
		int actual = calculator.add(a,b);
		assertEquals(expect, actual);
		
	}
	@Test
	public void testSubtract() {
		Calculator calculator = new Calculator();
		int expect = 5;
		int actual = calculator.subtract(a,b);
		assertEquals(expect, actual);
	}

}
