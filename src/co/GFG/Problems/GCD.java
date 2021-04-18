package co.GFG.Problems;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int b = s.nextInt();
			int ans = 1;
			int x = Math.min(a, b);
			for (int i = 1; i <= x; i++) {
				if (a % i == 0 && b % i == 0) {
					ans = i;
				}
			}
			System.out.println(ans);
		}
	}
}
