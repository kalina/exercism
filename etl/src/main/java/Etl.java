import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etl {

	private static Map<String, Integer> scores = new HashMap<String, Integer>();

	public Etl(){

		scores.put("a", 1);
		scores.put("b", 3);
		scores.put("c", 3);
		scores.put("d", 2);
		scores.put("e", 1);
		scores.put("f", 4);
		scores.put("g", 2);
		scores.put("h", 4);
		scores.put("i", 1);
		scores.put("j", 8);
		scores.put("k", 5);
		scores.put("l", 1);
		scores.put("m", 3);
		scores.put("n", 1);
		scores.put("o", 1);
		scores.put("p", 3);
		scores.put("q", 10);
		scores.put("r", 1);
		scores.put("s", 1);
		scores.put("t", 1);
		scores.put("u", 1);
		scores.put("v", 4);
		scores.put("w", 4);
		scores.put("x", 8);
		scores.put("y", 4);
		scores.put("z", 10);
	}

	public Map<String, Integer> transform(Map<Integer, List<String>> old) {
		Map<String, Integer> out = new HashMap<String, Integer>();

		for (Map.Entry<Integer, List<String>> entry : old.entrySet()){
			List<String> letters = entry.getValue(); 

			for(String letter : letters){
				letter = letter.toLowerCase();
				out.put(letter, scores.get(letter));
			}
		}
		return out;
	}
}