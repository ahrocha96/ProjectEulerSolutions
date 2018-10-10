
public class p6 {
	public static void main(String args[]) {
		int sumOfSquares = 0;
		int squareOfSums= 0;
		int regularSums = 0;
		for (int i = 0; i<=100; i++){
			sumOfSquares = sumOfSquares+(i*i);
			regularSums = regularSums + i;
		}
		squareOfSums = regularSums*regularSums;
		int solution = squareOfSums-sumOfSquares;
		System.out.println(solution);
	}
}
