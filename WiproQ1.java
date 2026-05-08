package coreJavaExamples;

import java.util.ArrayList;
import java.util.List;

public class WiproQ1 {
    public static void main(String[] args) {
        String str = "Pavan-54#Abhijit-37#John-76";
       String[] words = solution(str);
        for(String word : words){
            System.out.println(word);
        }
    }
    public static String[] solution(String str){

        String[] words = str.split("#");
        return words;
    }
}
