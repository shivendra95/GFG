package co.GFG.Problems;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n = s.nextInt();
			int i = 1;
			while (i <= n) {
				int j = 1;
				while (j <= n - i) {
					System.out.print(" ");
					j++;
				}
				int k = 1;
				while (k <= 2 * i - 1) {
					System.out.print("*");
					k++;
				}
				i++;
				System.out.println();
			}
		}

	}

}
