
public class p5 {
	public static void main(String args[]) {
		int solution = 1;
		while (notDivisible(solution)) {
			solution++;
		}
		System.out.println(solution);
	}

	public static boolean notDivisible(int x) {
		int counter = 0;
		for (int i = 1; i <= 20; i++) {
			if (x % i == 0) {
				counter++;
			}
		}
		if (counter != 20) {
			return true;
		} else {
			return false;
		}
	}
}
