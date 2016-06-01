package java.pp.mathsproblem;

/**
 * Prime Number Logic: Prime Number are divisible by itself only.
 * 
 */
public class FindPrimeNumber {

	public static boolean isPrime(int number) {
		if (number <= 0)
			return false;

		if (number % 2 == 0 && number != 2)
			return false;
		// for (int i = 2; i < number/2; i++)
		for (int i = 3; i < Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
