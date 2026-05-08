package naveenAutomationLabs;

public class stringReverse {
    public static void main(String[] args) {
        String s = "Selenium";
        String rev = "";

        //1- using for loop
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

        //2- Using inbuilt method
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}
