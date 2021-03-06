package com.znn.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathUtilsTest {
	private int numberA;
	private int numberB;
	private int expected;

	//parameters pass via this constructor
	public MathUtilsTest(int numberA, int numberB, int expected) {
		this.numberA = numberA;
		this.numberB = numberB;
		this.expected = expected;
	}

	//Declares parameters here
	@Parameters
	public static Iterable<Object[]> data1() {
		return Arrays.asList(new Object[][] { 
			{ 1, 1, 2 }, 
			{ 2, 2, 4 }, 
			{ 8, 2, 10 }, 
			{ 4, 5, 9 } 
		});
	}

	@Test
	public void test_add() {	
		assertEquals("程序判断是否相等",expected,MathUtils.add(numberA, numberB));
		assertEquals("绝对相等",5, 6);
	
	}

}