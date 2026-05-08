package rahulshettyCoreJavaSec8;

public class multiplyWithoutMultiplicationOperator {

    /* method to achieve multiplication table without multiply operator */

    public static void main(String[] args) {
        System.out.println(multiply(5,8));
        System.out.println(multiplyWithForLoop(5,8));
    }

    //With WHILE Loop
    public static int multiply(int i, int j){
        //here i should add with itself for j times
        int counter=1;
        int sum=0;
        while(counter<=j){
            sum += i;
            counter++;
        }
        return sum;
    }
    //With For Loop
    public static int multiplyWithForLoop(int a, int b){
        int sum=0;
        for(int i=0; i<b; i++){
            sum += a;
        }
        return sum;
    }
}
