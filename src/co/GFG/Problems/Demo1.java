package co.GFG.Problems;

interface Abc{
	void hello();
}

 class Example implements Abc{
	public void hello() {
		System.out.println("Wow!!");
	}
}

public class Demo1 {
	static boolean b1, b2;
	  static boolean foo(char c) 
	    {
	        System.out.print(c); 
	        return true; 
	    }
	public static void main(String[] args) {
int value = 3, sum = 6 + -- value; 
		System.out.println(sum);
		int data = --value + ++value / sum++ * value++ + ++sum % value--; 
		System.out.println(data); 
		 int arr[] = { 65, 66, 67, 68};
	       String s = new String(arr, 1, 3);
	       System.out.println(s);
	       
		System.out.println(b1);
		 int i = 0; 
	        for (foo('A'); foo('B') && (i < 2); foo('C')) 
	        {
	            i++; 
	            foo('D'); 
	        } 
	        
	}

}
