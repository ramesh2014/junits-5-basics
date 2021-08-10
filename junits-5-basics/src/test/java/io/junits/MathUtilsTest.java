package io.junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		//https://junit.org/junit5/docs/current/user-guide/#overview
		
		//https://junit.org/junit5/docs/current/api/index.html
		
		System.out.println("Begin of test");
		
		int expected = 2;
		int actual = MathUtils.sum(1, 2);
		
		assertEquals(expected, actual, "The add method should add two numbers");
		//assertArrayEquals
		//assertIterableEquals
		
		System.out.println("End of test");
	}

}
