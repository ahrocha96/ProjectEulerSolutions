
public class p4 {
	public static void main(String args[]) {
		int multiplier = 0;
		int multiplicand = 0;
		int product = 0;
		int largestPalindrome = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				product = i * j;
				if (isPalindrome(product) && product > largestPalindrome) {
					multiplier = i;
					multiplicand = j;
					largestPalindrome = product;
				}
			}
		}
		System.out.println("Multiplicand: " + multiplicand + "\nMultiplier: " + multiplier
				+ "\nLargest Palindrome Product of two 3-digit numbers: " + largestPalindrome);
	}

	public static boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		String reverse = new StringBuffer(s).reverse().toString();
		if (s.equals(reverse)) {
			return true;
		}
		else {
			return false;
		}

	}
}
