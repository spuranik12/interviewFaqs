package rahulshettyCoreJavaSec8;

public class sumOfAllElements {

    /* create a method which accepts array and returns sum of elements in array */

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(sumOfArrElements(arr));
    }

    public static int sumOfArrElements(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        /* using enhanced for loop
        for(int j : arr){
            sum += j;
        }
         */
        return sum;
    }
}
