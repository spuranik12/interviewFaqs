package JPMInterviewPractice;

import java.util.ArrayList;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int arr[] = {10,5,33,118,49,63};
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

}
