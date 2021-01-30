package com.demo.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitDemoTest {

	JunitDemo jd;
	
	@BeforeAll
	static void before()
	{
		System.out.println("Welcome");
	}
	
	@BeforeEach
	void beforeEachFunc()
	{
		jd = new JunitDemo();
	}
	
	@Test
	void test1() {
		int a = 2000;
		Boolean bool = jd.isLeapYear(a);
		assertEquals(true,bool);                //assertFalse(bool);
	}
	
	@Test
	void test2() {
		int a = 1900;
		Boolean bool = jd.isLeapYear(a);
		assertEquals(false,bool);                //assertFalse(bool);
	}
	
	@Test
	void test3() {
		int a = 1904;
		Boolean bool = jd.isLeapYear(a);
		assertEquals(true,bool);                //assertFalse(bool);
	}
	
	@Test
	void test4() {
		int a = 1902;
		Boolean bool = jd.isLeapYear(a);
		assertEquals(false,bool);                //assertFalse(bool);
	}
		
	@AfterEach
	void afterEachFunc()
	{
		jd = null;
	}
	
	@AfterAll
	static void after()
	{
		System.out.println("Thanks");
	}
}
