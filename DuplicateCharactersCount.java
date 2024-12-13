import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersCount {

	public static void main(String[] args) {
		String str = "Hello how are you doing";
		char characters[] = str.toCharArray();

		Map<Character, Integer> charsMap = new HashMap<Character, Integer>();
		for (Character ch : characters) {
			if (charsMap.containsKey(ch)) {
				charsMap.put(ch, charsMap.get(ch) + 1);
			} else {
				charsMap.put(ch, 1);
			}

		}

		Set<Character> keys = charsMap.keySet();
		for (Character ch : keys) {
			System.out.println(ch + " is " + charsMap.get(ch));
		}

	}

}
