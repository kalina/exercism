import java.util.HashMap;
import java.util.Map;


public class DNA {

	private Map<Character, Integer> nucleotideCount = new HashMap<Character, Integer>();

	public DNA(String string) {
		initializeCount();

		for(int i = 0; i< string.length(); i++){
			nucleotideCount.put(string.charAt(i), ((Integer)nucleotideCount.get(string.charAt(i))) +1);
		}
	}

	public Integer count(char c) throws IllegalArgumentException{
		if (!nucleotideCount.containsKey(c)) throw new IllegalArgumentException();

		return (Integer) nucleotideCount.get(c);
	}

	public Map<Character, Integer> nucleotideCounts() {
		return nucleotideCount;
	}

	private void initializeCount(){
		nucleotideCount.put('A', 0);
		nucleotideCount.put('C', 0);
		nucleotideCount.put('G', 0);
		nucleotideCount.put('T', 0);
	}
}