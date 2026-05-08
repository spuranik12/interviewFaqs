package coreJavaExamples;

import java.util.LinkedHashSet;
import java.util.Set;

public class getUniqueNumbersFromLongNumber {
    public static void main(String[] args) {
        long num = 322454546116L; //long values should be ALWAYS denoted as L at end
        String str = String.valueOf(num);
        Set<Integer> digits = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            digits.add(Character.getNumericValue(ch));
        }
        //System.out.println(digits); //- will print in array
        StringBuilder sb = new StringBuilder();
        for(int digit : digits){
            sb.append(digit);
        }

        //convert string to long
        long uniqueDigits = Long.parseLong(sb.toString());
        System.out.println(uniqueDigits);
    }
}
