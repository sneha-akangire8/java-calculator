package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaCalculatorApplicationTests {

	@Test
	void testAdditionWithPositiveNumbers() {

		Calculator calculator = new Calculator();

		assertEquals(30, calculator.add(10, 20));
	}

	@Test
	void testAdditionWithZero() {

		Calculator calculator = new Calculator();

		assertEquals(5, calculator.add(0, 5));
	}
}