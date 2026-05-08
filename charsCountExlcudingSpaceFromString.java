package coreJavaExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class charsCountExlcudingSpaceFromString {
    public static void main(String[] args) {
        String str = "My name is Shrihari";
        System.out.println(solution(str));
    }
    public static Map<Character,Integer> solution(String str){
        Map<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
        for(char ch : str.replace(" ","").toCharArray()){
            Integer count = hashMap.get(ch);
            if(count == null){
                hashMap.put(ch,1);
            }else{
                hashMap.put(ch,++count);
            }
        }
        return hashMap;
    }
}
