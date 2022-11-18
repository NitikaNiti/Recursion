package recursion;

public class Binarysearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 66, 77, 88 };
		int target = 66;

		int ans = serach(arr, target, 0,arr.length - 1);
		System.out.println(ans);
	}

	private static int serach(int[] arr, int target, int s, int e) {

		// base condition

		if (s > e) {
			return -1;
		}
		int m = s + (e - s) / 2;
		if (arr[m] == target) {
			return m;
		}

		if (arr[m] > target) {
			return serach(arr, target, s, m - 1);
		} else {
			return serach(arr, target, m+1, e);
		}

	}

}
