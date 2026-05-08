package coreJavaExamples;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");
        for(int num = 1; num<=100; num++){
            if(isPrime(num)){
                System.out.println(num);
            }
        }
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i=2; i*i<=number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
