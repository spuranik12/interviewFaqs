package rahulshettyCoreJavaSec8;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
In given array, find unique number by eliminating duplicate values.
Logic: First we need to get which number is repeating how many times.
For that, use arrayList which is EMPTY and add number and see if same number added is repeating
If repeating, increase counter and see at last if which counter value is 1 that will be unique.
 */
public class eliminateDuplicateAndFindUniqueInArray {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,1,1,2,3,5,1,3,3};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<a.length; i++){
            int k=0; //every time this has to set 0 after each element

            //check in EMPTY arraylist if value consists, if not add only once and increment counter
            if(!al.contains(a[i])){
                al.add(a[i]);
                k++;

                for(int j=i+1; j<a.length; j++){
                    if(a[i] == a[j]){
                        k++;
                    }
                }
                System.out.println(a[i] + " is repeating " + k + " time(s)");

                if(k==1){
                    System.out.println("Unique number in an array is - " + a[i]);
                }
            }
        }
    }
}
