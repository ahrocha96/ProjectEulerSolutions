
public class p2 {
	public static void main(String args[]){
		//represents next term in fib. sequence
		int tempSum = 0;
		//Initialized at 2 because secondTerm is initialize at 2
		int sumEvens = 2;
		int firstTerm = 1;
		int secondTerm = 2;
		while (tempSum < 4000000)
		{
			tempSum = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = tempSum;
			if(tempSum%2 == 0){
				sumEvens = sumEvens + tempSum;
			}
		}
		System.out.println(sumEvens);
	}
}
