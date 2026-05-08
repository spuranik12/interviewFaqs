package coreJavaExamples;

import java.util.ArrayList;
import java.util.List;

public class OddEvenElementSeparationInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        List<Integer> al1 = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        for(int number : arr){
            if(number % 2 !=0){
                al1.add(number);
            }else{
                al2.add(number);
            }
        }
        al1.addAll(al2);
        System.out.println(al1);
    }
}
