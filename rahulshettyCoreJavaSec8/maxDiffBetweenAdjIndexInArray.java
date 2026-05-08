package rahulshettyCoreJavaSec8;

public class maxDiffBetweenAdjIndexInArray {

    /* Find max difference between adjacent index in an array */

    public static void main(String[] args) {
        int[] arr = {1,4,8,15,17};
        System.out.println(maxDiffInArray(arr));
    }

    public static int maxDiffInArray(int[] array){
        int maxDiff=0;
        for(int i=0; i<array.length-1; i++){
            if((array[i+1] - array[i]) > maxDiff){
                maxDiff = array[i+1] - array[i];
            }
        }
        return maxDiff;
    }
}
