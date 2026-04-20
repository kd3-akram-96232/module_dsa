import java.util.*;

class WordCount {

    public static void main(String[] args) {
        String line = "java is easy and java is powerful";

        String[] words = line.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}