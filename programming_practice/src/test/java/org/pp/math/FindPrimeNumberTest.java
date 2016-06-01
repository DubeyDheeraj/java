package org.pp.math;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.pp.math.FindPrimeNumber;

public class FindPrimeNumberTest {

	@Test
	public void isPrimeTestNegative() {
		assertFalse(FindPrimeNumber.isPrime(-1));
	}

	@Test
	public void isPrimeTestZero() {
		assertFalse(FindPrimeNumber.isPrime(0));
	}

	@Test
	public void isPrimeTestValidPrime() {
		assertTrue(FindPrimeNumber.isPrime(1));
	}

	@Test
	public void isPrimeTestInvalidValueDevisibleBy2() {
		assertFalse(FindPrimeNumber.isPrime(4));
	}

	@Test
	public void isPrimeTestFindListOfPrime() {
		Integer[] expectedResult = { 1, 2, 3, 5, 7, 9, 11, 13, 17, 19 };
		ArrayList<Integer> actualResult = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			if (FindPrimeNumber.isPrime(i)) {
				actualResult.add(i);
			}
		}
		assertArrayEquals(expectedResult, actualResult.toArray(new Integer[actualResult.size()]));
	}
}
