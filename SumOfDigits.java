package recursion;

public class SumOfDigits {

	public static void main(String[] args) {
		int ans = sumOf(1342);
		System.out.println(ans);
	}

	 static int sumOf(int n) {

		if (n == 0) {
			return 0;
		}
		
		return (n%10) + sumOf(n/ 10) ;
	
	}

}
