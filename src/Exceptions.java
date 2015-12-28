
public class Exceptions {
	public static void main(String[] args) {
		int badInput = 0;
		int goodInput=2;
		
		trycatch(badInput);
		System.out.println("-----------------");
		
		trycatch(goodInput);
		System.out.println("-----------------");
		
		try{
			throwException(badInput);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			System.out.println("I got an exception! Now I have to handle it!");
			System.out.println(5/(badInput+1));
		}
		System.out.println("-----------------");
		
		try{
			throwException(goodInput);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			System.out.println("I got an exception! Now I have to handle it!");
			System.out.println(5/(badInput+1));
		}
	}

	private static void trycatch(int x) {
		try{
			System.out.println(5/x);
		}
		catch(ArithmeticException e){
			System.out.println("No silly! We can't divide by zero! I'll add one to your input to "
					+ "handle the exception.");
			x+=1;
			System.out.println(5/x);
		}
	}

	private static void throwException(int x) throws ArithmeticException{
		if(x==0){
			throw new ArithmeticException("No silly! We can't divide by zero! I'll throw an exception"
					+ "\nto stop the code from progressing! Whoever calls this code will handle it!");
		}
		System.out.println(5/x);
	}
}
