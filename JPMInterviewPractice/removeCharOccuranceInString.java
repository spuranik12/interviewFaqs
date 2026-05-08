package JPMInterviewPractice;

public class removeCharOccuranceInString {
    public static void main(String[] args) {
        String str = "abcdACGDLKxsjodAacdkl".toLowerCase();
        str = str.replace("a","");
        System.out.println(str);
    }
}
