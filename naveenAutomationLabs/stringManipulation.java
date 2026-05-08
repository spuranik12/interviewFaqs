package naveenAutomationLabs;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class stringManipulation {
    public static void main(String[] args) {

        String str = "This is core java session";
        String str1 = "This is Core Java session";

        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf('s',str.indexOf('s')+1));
        System.out.println(str.indexOf('s')+ 6);
        System.out.println(str.indexOf("session"));
        System.out.println(str.indexOf("hello")); //if not exists, returns -1

        //String comparision
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        //sub string
        System.out.println(str.substring(0,4));

        //trim - used only for before and after spaces not applicable for in-betweeb spaces
        String s = "   Hello World  ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));// to remove inbetweeb spaces

        //split
        String test = "Shrihari Puranik is a Software Tester";
        String arr[] = test.split(" ");
        ArrayList<String> al = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase("Shrihari") ||
                    arr[i].equalsIgnoreCase("Puranik")){
                al.add(arr[i]);
            }
        }
        Object[] output = al.toArray();
        System.out.println(Arrays.toString(output));
    }
}
