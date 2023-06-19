package conditionals;

class java {
	public static void main(String[] args) {
		if ((true && !false) || false) {
			System.out.println("This is true");
		} else if (true) {
			System.out.println("This is also true");
		} else {
			System.out.println("This prints otherwise");
		}
	}
}