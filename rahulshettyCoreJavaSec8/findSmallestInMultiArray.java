package rahulshettyCoreJavaSec8;

/*
Find smallest integer from multidimensional array.
Here logic is assume 1st row 1st element is smallest and then traverse to all rows and columns
to compare.
 */
public class findSmallestInMultiArray {
    public static void main(String[] args) {
        int[][] arr = {{4,3,4},{8,6,3},{5,11,9}};
        int minVal = arr[0][0]; //assuming value of [0,0] i.e 4 from given array is min by default
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i][j] < minVal){
                    minVal = arr[i][j];
                }
            }
        }
        System.out.println(minVal);
    }
}
