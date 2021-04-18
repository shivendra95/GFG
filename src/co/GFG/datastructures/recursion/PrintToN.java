package co.GFG.datastructures.recursion;

public class PrintToN {

	static void printToN(int n) {
		if (n == 0)
			return;

		System.out.print(n + " ");

		printToN(n - 1);

	}

	public static void main(String[] args) {
		int n = 4;

		printToN(n);

	}

}
