package coreJavaExamples;

import java.util.Scanner;

public class checkOddNumbers {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9};
        for(int j : arr) {
            if (j % 2 == 1) {
                System.out.println(j + "- is odd number");
            }
        }
    }
}
