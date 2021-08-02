package mock01;

public class try_ex1 {
	
	public static void main(String[] args) {
		
		int a=2;
		int b=0;
		int c;
		
		try {
			c=a/b;
		} catch (ArithmeticException e) {
			System.out.println("exception handled...");
		}
		
		
		
	}

}
