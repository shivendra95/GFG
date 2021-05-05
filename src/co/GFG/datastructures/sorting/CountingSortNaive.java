package co.GFG.datastructures.sorting;

public class CountingSortNaive {
	static void countSort(int arr[], int n, int k) {
		int[] count = new int[k];
		for (int i = 0; i < k; i++)
			count[i] = 0;
		for (int i = 0; i < n; i++)
			count[arr[i]]++;

		int index = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < count[i]; j++) {
				arr[index] = i;
				index++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 4, 1, 0, 1 };
		int n = arr.length;
		int k = 5;
		countSort(arr, n, k);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
