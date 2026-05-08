package rahulshettyCoreJavaSec8;

/*  SORT AN ARRAY IN ASC and DESC ORDER
- compare each index with all index values then sort
- Means 1 value with all other values in array. This should do for all elements
 */

import java.util.Arrays;

public class sortAscAndDescInArray {
    public static void main(String[] args) {
        int[] a = {2,6,1,4,9};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    /* OR WITHOUT TEMP
                    a[i] = a[i]+a[j];
                    a[j] = a[i]-a[j];
                    a[i] = a[i]-a[j];
                     */
                }
            }
        }
        System.out.println("Ascending order is - " + Arrays.toString(a));
    }
}
