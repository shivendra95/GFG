package co.GFG.datastructures.arrays;

public class IsSorted {

	static boolean isSorted(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] < arr[i - 1])
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 12, 30, 2, 35 }, n = 5;

		System.out.println(isSorted(arr, n));
	}

}
