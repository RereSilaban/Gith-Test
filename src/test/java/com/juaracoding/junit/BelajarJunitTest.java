package com.juaracoding.junit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BelajarJunitTest {

	@BeforeClass
	public static void methodBeforeClass() {
		System.out.println("Method Before Class");
	}
	@Before
	
	public void methodBefore() {
		System.out.println("-----Method Before");
	}
	
	
	@Test
	public void methodTest1() {
		System.out.println("Method test 1");
	}
	
	
	@Test
	public void methodTest2() {
		System.out.println("Method test 2");
	}
	
	@AfterClass
	public	void methodAfter() {
		System.out.println("Method After test");
	}
	
	@AfterClass
	public static void methodAfterClass() {
		System.out.println("-----Method After Class");
	}
}
