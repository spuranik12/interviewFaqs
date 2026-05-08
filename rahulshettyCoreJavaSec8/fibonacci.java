package rahulshettyCoreJavaSec8;

public class fibonacci {
    public static void main(String[] args) {
        /*
        Fibonacci series : 0,1,1,2,3,5,8,13,21...
        Add's its adjacent number and place sum as next number.
        Swap for next iteration with temp variable
         */
        int a=0;
        int b=1;

//        int i=0;
//        while(i<8){
//            int sum = a+b;
//            System.out.println(sum);
//            //For next iteration it should swap a and b values
//            a = b;
//            b = sum;
//            i++;
//        }

        for(int i=0; i<8; i++){
            int sum = a+b;
            System.out.println(sum);
            //For next iteration it should swap a and b values
            a = b;
            b = sum;
        }
    }
}
