package co.GFG.datastructures.arrays;

public class SecondLargest {

	static int getSecondLargest(int arr[]) {
		int res = -1, largest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[largest]) {
				res = largest;
				largest = i;
			} else if (arr[i] != arr[largest]) {
				if(res==-1|| arr[i]>arr[res]) {
					res=i;
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 12, 30, 2, 35 };

		System.out.println(getSecondLargest(arr));
	}

}
