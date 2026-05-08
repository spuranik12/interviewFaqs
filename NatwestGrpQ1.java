package coreJavaExamples;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NatwestGrpQ1 {
    public static void main(String[] args) {
        /*
        Get only least count of words repeated in string
         */
        String str = "Java is great Java is " +
                "great but powerfull as well but powerfull as well but powerfull as well";
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String word : str.split("\\s")){
            Integer count = map.get(word);
            if(count == null){
                map.put(word,1);
            }else{
                map.put(word, ++count);
            }
        }
        System.out.println(map);

        //for get least values from map.
        int min = Collections.min(map.values());
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() == min){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }

        //Additional logic, if maximum ocurances of values
        //for get least values from map.
//        int max = Collections.max(map.values());
//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            if(entry.getValue() == max){
//                System.out.println(entry.getKey()+"-"+entry.getValue());
//            }
//        }
    }
}
