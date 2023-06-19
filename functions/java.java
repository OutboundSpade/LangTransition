package functions;

class java {
	public static void main(String[] args) {
		String name = "John";
		System.out.println(greet(name));
	}

	private static String greet(String name) {
		return "Hello " + name;
	}
}