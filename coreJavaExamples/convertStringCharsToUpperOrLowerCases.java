package coreJavaExamples;

public class convertStringCharsToUpperOrLowerCases {
    public static void main(String[] args) {
        String str = "HexAwarE";
        String newStr = "";
        char[] characters = str.toCharArray();
        for(char ch : characters){
            if(Character.isUpperCase(ch)){
                newStr += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                newStr += Character.toUpperCase(ch);
            }else{
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }
}
