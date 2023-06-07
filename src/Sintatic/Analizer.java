package Sintatic;

public class Analizer {

	private String input; // String de entrada
	private int currentIndex; // Índice actual en el String

	public Analizer(String input) {
		this.input = input;
		this.currentIndex = 0;
	}

	public boolean S() {
		boolean valid = false;
		if (currentIndex < input.length() && input.charAt(currentIndex) == 'b') {
			currentIndex++;
			valid = B();
		}
		return valid;
	}

	public boolean B() {
		boolean valid = false;
		if (currentIndex < input.length() && input.charAt(currentIndex) == 'a') {
			currentIndex++;
			if (currentIndex <= input.length() && input.charAt(currentIndex) == '°') {
				valid = true;
			} else {
				valid = B();
			}
		}
		return valid;
	}

	public void syntaxError() {
		System.out.println("Syntax error at:");
		System.out.println(input);
		for (int i = 0; i < currentIndex; i++) {
			System.out.print(" ");
		}
		System.out.println("^");
	}

}