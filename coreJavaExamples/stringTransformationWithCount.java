package coreJavaExamples;

public class stringTransformationWithCount {
    public static void main(String[] args) {
        String input = "tomorrow";
        String lowerInput = input.toLowerCase();  // to make it case-insensitive
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lowerInput.length(); i++) {
            char currentChar = lowerInput.charAt(i);
            int count = 0;

            // Count occurrences of currentChar
            for (int j = 0; j < lowerInput.length(); j++) {
                if (lowerInput.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Append the count if > 1, else append the character
            result.append(count > 1 ? String.valueOf(count) : String.valueOf(currentChar));
        }

        System.out.println("Output: " + result);  // Output: 13m3223w
    }
}
