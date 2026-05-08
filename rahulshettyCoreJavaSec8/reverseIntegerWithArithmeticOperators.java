package rahulshettyCoreJavaSec8;

/*
We have seen String revers using string manipulation with std funtions. Integer is tricky!!
For that, example int is 345, it should print as 543.
Logic is: First divide whole int using mod (%) operator by 10. It would left out with last value
Next, divide whole int value by 10, to get remaining value after extracting in prev step.
In between we need to append after every modulus operation, for that multiple by 10 and add to extracted value

 example: int 345;
 >> 345 % 10 = 5 //extracted at 1st
 >> 345 / 10 = 34 (use this a next int value in next iteration)
 >> 34 % 10 = 4 //extracted at 2nd
 >> 34 / 10 = 3
 >> 3 % 10 = 3 //In mod, if numerator < denominator, result is numerator
 >>>> Total value would be 543 from extracted.


 */
public class reverseIntegerWithArithmeticOperators {
    public static void main(String[] args) {
        int a = 345;
        int reversedValue = 0;
        while(a!=0){ //until int value is null

            int val = a % 10;

            reversedValue = val + reversedValue*10;

            //Here in above step, storing extrated value in variable. Along with that, we need to append
            // in each iteration. So, multiple by 10 to reveresedValue
            //ex: in 1st : 5 is extracted >> 0 =  5 + 0*10
            // in 2nd : 4 is extracted >> 5 = 4 + 5*10;

            a = a / 10;
            //as we want int value every time assign to 'a'
        }
        System.out.println(reversedValue);
    }
}
