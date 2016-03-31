import java.util.HashSet;
import java.util.Set;

public class Pangrams {

	public static boolean isPangram(String string) {
		final Set<Character> lettersRemaining = getLetters();

		string = string.toLowerCase();
		for(int i = 0; i< string.length(); i++){
			lettersRemaining.remove(string.charAt(i));
		}
		return lettersRemaining.isEmpty();
	}

	private static Set<Character> getLetters(){
		final Set<Character> letters = new HashSet<Character>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			letters.add(ch);
		}
		return letters;
	}
}