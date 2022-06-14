package com.juaracoding.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BangunDatarTest.class, CalculatorTest.class }) //menjalankan semua kelas yang ingin dijalankan hanya 1 kali jalan saja
public class AllTests {

	
}
