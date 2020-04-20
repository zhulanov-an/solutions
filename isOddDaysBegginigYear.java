import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Calendar endDate = Calendar.getInstance();
        endDate.setTime(df.parse(date));

        if (endDate.get(Calendar.DAY_OF_YEAR) % 2 == 0){
            return false;
        } else {
            return true;
        }
    }
}
