import java.util.HashMap;

public class HashmapSearch {
    public static HashMap<String, Integer> findWordsSubstring(String prop, String token) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] words = prop.split(" ");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (word.contains(token.toLowerCase())) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String prop = "Lumea era curioasa, sa cunoasca din gura ministrului presedinte planul de actiune al guvernului fata de chestiunile mari, cari agiteaza tara intreaga";
        String token = "ar";

        HashMap<String, Integer> result = findWordsSubstring(prop, token);

        for(String word : result.keySet()) {
            System.out.println(word + ": " + result.get(word));
        }

        /* Output:
        mari: 1
        tara: 1
        cari: 1
        */
    }
}
