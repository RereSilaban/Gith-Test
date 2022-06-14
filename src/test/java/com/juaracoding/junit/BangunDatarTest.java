package com.juaracoding.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BangunDatarTest {
	BangunDatar bangunDatar;
	double s,p,l;
	@Before
	public void setUp() {
		bangunDatar = new BangunDatar();
		s=5;
		p=10;
		l=2;
	}
	
	@Test
	public void testLuasPersegi() {
		assertEquals(25, bangunDatar.luasPersegi(s),0.0); //0.0 dipakai untuk penyeimbang karna data menggunakan double sedangkan expect bilangan bulat tanpa koma.
	}

	@Test
	public void testLuasPersegiPanjang() {
		assertEquals(20, bangunDatar.luasPersegiPanjang(p, l),0.0);
	}
}
