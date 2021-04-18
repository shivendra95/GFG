package co.GFG.Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class FibBigInteger {

	public static BigInteger fib(int n) {
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);

		for (int j = 2; j <= n; j++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in)) {
			int t = sc.nextInt();

			while (t-- > 0) {
				// Taking input n
				int n = sc.nextInt();

				System.out.println(fib(n));
			}
		}
	}

}
