import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class WeekdaysPrinter {
        public static void main(String[] args) {
            List <String> weekdays  = new ArrayList<>();
            weekdays.add("Sunday");
            weekdays.add("Monday");
            weekdays.add("Tuesday");
            weekdays.add("Wednesday");
            weekdays.add("Thursday");
            weekdays.add("Friday");
            weekdays.add("Saturday");
            int i = 0;
            while (i< 5){
                System.out.println(weekdays.get(i));
                i++;

            }


        }
    }
