package coreJavaExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class getStringCount {
    public static void main(String[] args) {
        String input1 = "Shrihari puranik Shrihari Puranik";
        String input = input1.toLowerCase();
        String[] words = input.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(String word : words){
            Integer count = hashMap.get(word);
            if(count == null){
                hashMap.put(word,1);
            }else{
                hashMap.put(word, ++count);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet = hashMap.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
