package co.GFG.datastructures.recursion;

public class SumOfDigits {

	static int getSum(int n) {
		if (n == 0)
			return 0;

		return n % 10 + getSum(n / 10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(1234));
	}

}
