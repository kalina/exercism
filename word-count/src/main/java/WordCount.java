import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public Map<String, Integer> phrase(String string) {
		if (string == null) return null;
		Map <String,Integer> count  = new HashMap<String, Integer>();

		String[] words = string.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
		for(int i=0; i < words.length; i++){
			String word = words[i].toLowerCase();
			if(count.get(word) == null){
				count.put(word, 1);
			}else{
				count.put(word, count.get(word)+1);
			}
		}	
		return count;
	}
}
