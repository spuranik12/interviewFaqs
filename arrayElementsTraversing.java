package coreJavaExamples;

import java.sql.SQLOutput;
import java.util.Arrays;

public class arrayElementsTraversing {
    public static void main(String[] args) {
        int arr[] = {1, 5, 0, 6, 0, 2, 0, 3, 9};
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
