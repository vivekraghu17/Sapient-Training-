package com.sapient.bl.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sapient.bl.TestMe;

public class TestMeTest {

	
	
	
	@BeforeClass
	public static void setUpBeforeClass()
	{
		System.out.println("I am the first guy in test cases");
	}
	
	@AfterClass
	public static void tearDownAfterClass()
	{
		System.out.println("I am the last guy in test cases");
	}
	
	
	
	private TestMe t;
	
	@Before
	public void setUp()
	{
		System.out.println("Hi i am in before");
		t=new TestMe();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Hi i am in after");
	}
	
	
	@Test(timeout=1000)
	public void testSpeed()
	{
		String message="hI how are you doing";
		assertEquals("Checking two messaged for speed", "Message"+message,t.testTime(message));
	}
	
	
	@Test
	public void test() {
		TestMe t =new TestMe();
		assertTrue("Checking if the method returns true",t.sayHi());
	}

	@Test
	public void nameTest()	{
		TestMe t = new TestMe();
		String name="Kumar";
		assertEquals("Hi"+name,t.sayHi(name));
	}
	
	@Test(expected=RuntimeException.class)
	public void checkToThrowException()
	{
		int val=0;
		assertEquals(t.throwsSomeException(val),val );
	}
	
}
