package day3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        //3) Given: String with big text (more than 1000 words).
        // Write a method that calculates the numbers of words for each letter that starts the word.
        String inputString = "Given: String with big text (more than 1000 words)" +
                "Write a method that calculates the numbers of words for each letter that starts the word";

        Map<String, Integer> result = new HashMap<>();

        Arrays.stream(inputString.split(" "))
                .forEach(w -> {
                    String key = String.valueOf(w.charAt(0));
                    result.putIfAbsent(key, 0);
                    result.put(key, result.get(key) + 1);


        });

        System.out.println(result);
    }
}


