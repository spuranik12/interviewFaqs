package JPMInterviewPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringSequenceOccurenceCount {
    public static void main(String[] args) {
        String str = "qwertyuiopasabcdfghjklzcvbnlmbcdevczlkjhgfdsabcdpoiuytrewlmqasdfghjklm";

        /* Expected Output
        abcd - 2
        lm - 3
        bcde - 1
         */

        String[] patterns = {"abcd", "lm", "bcde"};

        HashMap<String, Integer> result = new HashMap<>();

        for (String pattern : patterns) {
            int count = 0;
            for (int i = 0; i <= str.length() - pattern.length(); i++) {
                if (str.substring(i, i + pattern.length()).equals(pattern)) {
                    count++;
                }
            }
            result.put(pattern, count);
        }

        // Print the results
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

    }
}
