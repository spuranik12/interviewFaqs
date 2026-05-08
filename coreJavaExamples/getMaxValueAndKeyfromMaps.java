package coreJavaExamples;

import java.util.HashMap;
import java.util.Map;

public class getMaxValueAndKeyfromMaps {
    public static void main(String[] args) {
        String str = "abcddbaebb";
        char[] characters = str.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for(char ch : characters){
            Integer count = hashMap.get(ch);
            if(count == null){
                hashMap.put(ch,1);
            }else{
                hashMap.put(ch, ++count);
            }
        }
        System.out.println(hashMap);
        char maxChar = ' ';
        int maxCount =0;
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println(maxChar+"="+maxCount);
    }
}
