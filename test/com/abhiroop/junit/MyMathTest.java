package com.abhiroop.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	
	@Test
	public void sum_with3numbers() {
		int sum = myMath.sum(new int[] {1, 2, 3});
		assertEquals(6, sum);
	}
	
	@Test
	public void sum_with1number() {
		int sum = myMath.sum(new int[] {197});
		assertEquals(197, sum);
	}

}
