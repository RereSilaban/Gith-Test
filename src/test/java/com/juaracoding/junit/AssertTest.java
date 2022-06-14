package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void assertMethod() {
		
		int num1 =5;
		int num2= 4;
		
		String nama= null;
		
		String mobil = new String("BMW");
		String motor = new String("Yamaha");
		
		String expect[]= {"A","B","C"};
		String actual[]= {"A","B","C"};
		
//		assertTrue(num1>num2); //data benar
//		assertFalse(num1<num2);//data salah
//		assertNull(nama); //isi data kosong
//		assertNotSame(mobil, motor); //data a dan b tidak sama
		assertArrayEquals(expect, actual); //untuk kesamaan data array
	
	}

}
