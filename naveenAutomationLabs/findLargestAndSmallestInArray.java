package naveenAutomationLabs;

import java.util.Arrays;

public class findLargestAndSmallestInArray {
    public static void main(String[] args) {
        int array[] = {10,40,0,-35,217,-9};

        //assume 1st element as largest and smallest, and the compare with other element
        //time complexity - O(n) as only single for loop is used
        int largest = array[0];
        int smallest = array[0];

        for(int i=1; i<array.length; i++){
            if(array[i]>largest){
                largest=array[i];
            } else if (array[i]<smallest) {
                smallest=array[i];
            }
        }
        System.out.println("Given Array is::"+ Arrays.toString(array));
        System.out.println("Largest number in array is::" + largest);
        System.out.println("Smallest number in array is::" + smallest);
    }
}
