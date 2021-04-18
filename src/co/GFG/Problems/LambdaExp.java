package co.GFG.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExp {
	static void printCond(Collection<Integer> C, Predicate<Integer> p)
    {
        for(Integer x: C)
        {
            if(p.test(x))
                System.out.print(x+" ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> al= new ArrayList<>(Arrays.asList(10,5,20,7,30));
		
		printCond(al, x -> x % 2 == 0 );
	}

}
