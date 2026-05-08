package coreJavaExamples;

public class stringReverseForEachWordInSentance {
    public static void main(String[] args) {
        String str = "Test is passed"; // Output: tseT si dessap;
        for(String word : str.split(" ")){
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            System.out.print(sb.toString()+" ");
        }
    }
}
