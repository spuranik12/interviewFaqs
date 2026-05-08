package JPMInterviewPractice;

import java.util.HashMap;

public class getDistinctCharsAndCountInString {
    public static void main(String[] args) {
        String str = "abcdAbCDabcd";
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        for(char ch : chars){
            Integer count = hashMap.get(ch);
            if(count == null){
                hashMap.put(ch,1);
            }else{
                hashMap.put(ch, ++count);
            }
        }
        System.out.println(hashMap);
    }
}
