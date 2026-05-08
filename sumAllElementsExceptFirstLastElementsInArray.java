package coreJavaExamples;

import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.ArrayList;
import java.util.Arrays;

public class sumAllElementsExceptFirstLastElementsInArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 3, 8, 9, 1}; //o/p: [2, 10, 9, 11, 17, 1]
        ArrayList<Integer> result = new ArrayList<>();
        //retain 1st element as it is.
        result.add(arr[0]);

        //sum middle elements starting from n+1 and ending till n-1
        for(int i=1; i<arr.length-2; i++){
            result.add(arr[i]+arr[i+1]);
        }

        //to retain last element
        result.add(arr[arr.length-1]);

        System.out.println(result);
    }
}
