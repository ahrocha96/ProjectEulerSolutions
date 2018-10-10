
public class p7 {
	public static void main(String args[]) {
		int solution = 0;
		int counter = 0;
		int i=0;
		while (counter != 10002) {
			while(true){
				i++;
				if (isPrime(i)){
					solution = i;
					counter++;
					if (counter == 10002){
						break;
					}
				}
			}
		}
		System.out.println(solution);
	}
	
	public static boolean isPrime(int x) {
		int factorCounter = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				factorCounter = factorCounter + 1;
			}
		}
		if (factorCounter > 2)
			return false;
		else
			return true;

	}
}
