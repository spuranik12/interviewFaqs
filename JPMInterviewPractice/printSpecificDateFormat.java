package JPMInterviewPractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class printSpecificDateFormat {
    public static void main(String[] args) {
        String pattern = "E,MM-dd-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        //format & parse the pattern
        String date = dateFormat.format(new Date());
        //create a runtime date object with formatted date pattern
        System.out.println(date);
    }
}
