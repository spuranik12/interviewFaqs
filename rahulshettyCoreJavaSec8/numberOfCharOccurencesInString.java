package rahulshettyCoreJavaSec8;

public class numberOfCharOccurencesInString {
    public static void main(String[] args) {
        String str = "aabcccde";
        char letter = 'c';
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("In a string " + "\"" + str + "\""  + " letter " + "' " + letter+ " '" + " is repeating " + count + " times");
    }
}
