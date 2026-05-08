package coreJavaExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharsRepeatationCountInString {
    public static void main(String[] args) {
        /*
        Count chars if repeating more than once and print char with count also if its repeating
         char only once then print only character.
         */
        System.out.println(solution("aaabbc"));
        System.out.println(solution("abc"));
        System.out.println(solution("prava"));
        System.out.println(solution("aaAbbcDD"));
        System.out.println(solution(""));
        System.out.println(solution(null));
        System.out.println(solution("aA"));
    }

    public static String solution(String s){
        if(s == null || s.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        Map<Character,Integer> hashMap = new LinkedHashMap<Character,Integer>();
        for(char ch : s.toCharArray()){
            Integer count = hashMap.get(ch);
            if(count == null){
                hashMap.put(ch,1);
            }else{
                hashMap.put(ch, ++count);
            }
        }
        //System.out.println(hashMap);
        for(Map.Entry<Character,Integer> entry : hashMap.entrySet()){
            result.append(entry.getKey());
            if(entry.getValue()>1){
                result.append(entry.getValue());
            }
        }
        return result.toString();
    }
}
