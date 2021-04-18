package co.GFG.Problems;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {
	public static BigInteger factorial(int a){
        BigInteger f=new BigInteger("1");
        for(int i=2;i<=a;i++){
            BigInteger x=BigInteger.valueOf(i);
            f=f.multiply(x);
        }
        return f;
    }

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int testcase = sc.nextInt();

			while(testcase-- > 0){
			    //Taking input a
			    int a = sc.nextInt();

			    System.out.println(factorial(a));
			}
		}

	}

}
