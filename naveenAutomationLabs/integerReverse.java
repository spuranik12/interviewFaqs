package naveenAutomationLabs;

public class integerReverse {
    public static void main(String[] args) {
        int num = 321356;

        //using arithmetic logic
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println(rev);

        //using String buffer
        int num1 = 678734;
        StringBuffer sf = new StringBuffer(String.valueOf(num1)); //valueOf is used to convert
        System.out.println(sf.reverse());
    }
}
