
public class HelloWorld {
	public static final String HELLO_WORLD= "Hello World";
	
	public static void main(String[] args) {
		System.out.println(HELLO_WORLD);
		System.out.println(helloWorldStatic());
		
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.helloWorldNonStatic());
	}
	
	private static String helloWorldStatic(){
		return HELLO_WORLD;
	}
	
	private String helloWorldNonStatic(){
		return HELLO_WORLD;
	}
}
