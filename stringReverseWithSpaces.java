package coreJavaExamples;

public class stringReverseWithSpaces {
    public static void main(String[] args) {
        String str = "a b c d";
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        System.out.println("\"" + rev + "\"");
    }
}
