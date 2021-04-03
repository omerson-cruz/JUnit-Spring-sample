package com.myproject.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean condition = true;
		assertTrue(condition);
		assertFalse(condition);
	}

}
