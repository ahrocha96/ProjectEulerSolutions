
public class Problem_1 {

	public static void main(String args[]){
		int sum = 0;
		for (int i = 0; i < 1000; i = i+3){
			sum = sum + i;
		}
		for (int i = 0; i < 1000; i = i+5){
			sum = sum + i;
			if (i%15 == 0){
				sum = sum - i;
			}
		}
		System.out.println(sum);
	}
}
