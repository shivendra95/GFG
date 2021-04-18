package co.GFG.datastructures.recursion;

public class Ex3 {

	// this program gives value of log(n)[base 2]
	static int fun(int n) {
		if (n == 1)
			return 0;
		else
			return 1 + fun(n / 2);
	}

	public static void main(String[] args) {
		System.out.println(fun(16));
	}

}
