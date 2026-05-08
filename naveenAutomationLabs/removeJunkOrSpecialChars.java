package naveenAutomationLabs;

public class removeJunkOrSpecialChars {
    public static void main(String[] args) {
        String s = "$@^%#^& Software Testing <<<";

        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
    }
}
