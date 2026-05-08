package coreJavaExamples;

public class stringManipulationAndPrintOnlyInitials {
    public static void main(String[] args) {
        String st1 = "amit kumar singh"; //a.k.singh
        String words[] = st1.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length-1; i++){
            sb.append(Character.toLowerCase(words[i].charAt(0))).append(".");
            //System.out.println(firstInitialChar);
        }
        sb.append(words[words.length-1]);
        System.out.println(sb.toString());
    }
}
