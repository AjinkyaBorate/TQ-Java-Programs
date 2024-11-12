package string;

//Check occurrences of particular  character, how many times it’s there and which diff positions.
public class A3_OccurenceOfParticularCharAndCountOfIt {

	public static void main(String[] args) {
		String text = "Hello, welcome to the world of programming";
		char character = 'o';
		int count = countCharOccurrences(text, character);
		System.out.println("Character '" + character + "' occurs " + count + " times.");
		System.out.print("Positions: ");
		printCharPositions(text, character);
	}

	public static int countCharOccurrences(String text, char character) {
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}

	public static void printCharPositions(String text, char character) {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == character) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

}
