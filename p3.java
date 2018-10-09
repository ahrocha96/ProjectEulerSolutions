
public class p3 {
	public static void main(String args[]) {
		long n = 600851475143L;
		long largestPrimeFactor = 0;
		for(long i = 1; i<n; i++){
			System.out.println(largestPrimeFactor);
			if(isFactor(i) && isPrime(i)){
				largestPrimeFactor = i;
			}
		}
		System.out.println(largestPrimeFactor);
	}

	public static boolean isFactor(long x) {
		long n = 600851475143L;
		System.out.println(x);
		if (n % x == 0)
			return true;
		else
			return false;

	}
	
	public static boolean isPrime(long x){
		int factorCounter = 0;
		for(long i = 1; i<=x; i++){
			if(x%i == 0){
				factorCounter = factorCounter + 1;
			}
		}
		System.out.println(factorCounter);
		if (factorCounter>2)
			return false;
		else
			return true;

	}
}
