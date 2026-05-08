package rahulshettyCoreJavaSec8;

public class reverseStringOrPalindrome {
    public static void main(String[] args) {
        String str = "madam1";

        //using StringBuilder
        StringBuilder newStr = new StringBuilder();
        for(int i= str.length()-1; i>=0; i--){
            newStr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(String.valueOf(newStr))){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }

        //using String manipulation
        String newStr1 = " ";
        for(int i=str.length()-1;i>=0;i--){
            newStr1 += str.charAt(i);
        }if(str.equals(newStr1)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
