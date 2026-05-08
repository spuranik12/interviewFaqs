package coreJavaExamples;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter required string : ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String expStr = "";

        for(int i=str.length()-1;i>=0;i--){
            expStr += str.charAt(i);
        }
        if(str.equalsIgnoreCase(expStr)){
            System.out.println(expStr + "- is a palindrome");
        }else{
            System.out.println(expStr + "- is NOT a palindrome");
        }
    }
}
