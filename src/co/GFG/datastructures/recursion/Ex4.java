package co.GFG.datastructures.recursion;

public class Ex4 {
	// this program gives binary representation of the given number n
	static void fun(int n) {
		if (n == 0)
			return;

		fun(n / 2);

		System.out.println(n % 2);

	}

	public static void main(String[] args) {
		fun(7);
	}
}
