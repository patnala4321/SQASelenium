import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateStringCount {

	public static void main(String[] args) {
		String sentense = "Hello how are you doing hello how is it is";
		String sentenseSplit[] = sentense.split(" ");

		Map<String, Integer> sentenseMap = new HashMap<String, Integer>();
		for (String sen : sentenseSplit) {
			if (sentenseMap.containsKey(sen))
				sentenseMap.put(sen, sentenseMap.get(sen) + 1);
			else
				sentenseMap.put(sen, 1);
		}

		Set<String> keys = sentenseMap.keySet();

		for (String key : keys) {

			System.out.println(key + " is available " + sentenseMap.get(key) + " times");
			

		}
	}

}
