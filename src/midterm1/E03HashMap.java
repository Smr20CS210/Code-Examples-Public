package midterm1;

import java.util.HashMap;
import java.util.Map;

public class E03HashMap {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        String data = "puppies are cute, puppies are fun";
        for (String word : data.split(" ")) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        for (String key : wordCount.keySet()) {
            System.out.println("key,value= " + key + ": " + wordCount.get(key));
        }

    }
}
