package co.GFG.Problems;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(5, 10, 20, 30, 8, 7);

		l.stream().filter(x -> x % 2 == 0).filter(x -> x > 10).forEach(System.out::println);

		int arr[] = { 30, 20, 10 };

		int sum = Arrays.stream(arr).sum();

		System.out.println(sum);
	}

}
