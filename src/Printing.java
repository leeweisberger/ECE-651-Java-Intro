
public class Printing {
	public static void main(String[] args) {
		simplePrint();
		System.out.println("-----------------");
		concatPrint();
		System.out.println("-----------------");
		newLinePrint();
		System.out.println("-----------------");
		complicatedPrint();
	}

	private static void simplePrint() {
		System.out.println("x = 5");
	}

	private static void concatPrint() {
		int x = 5;
		System.out.println("x = " + x);
	}
	
	

	private static void newLinePrint() {
		System.out.println("We can add a newLine by printing a blank line: ");
		System.out.println();
		System.out.println("Or by using a newline \ncharacter");
		
	}

	private static void complicatedPrint() {
		String simple = "This is a string ";
		int x=5;
		int y=6;
		System.out.println("We can concat anything like " + x + " " + simple + y +
				" But some characters have to be escaped with a \\ : \' \" ");
	}
}
