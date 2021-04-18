package co.GFG.Problems;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a = s.nextInt();
			int b = s.nextInt();
			int x = Math.max(a, b);
			int y = a * b;
			int ans = x;
			for (int i = x; i <= y; i++) {
				if (i % a == 0 && i % b == 0) {
					ans = i;
					break;
				}
			}
			System.out.print(ans);
		}
	}

}
