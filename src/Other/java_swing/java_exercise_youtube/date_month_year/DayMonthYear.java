package java_exercise_youtube.date_month_year;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DayMonthYear {
    public static void main(String[] args) {
        // hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy forr: " + t1);
        System.out.println("Trước khi chạy forr: " + t2);
        System.out.println("Thời gian chayj " + (t2-t1) + "mls");
        System.out.println("Thời gian chạy " + (t2 - t1)/1000 + "s");

        // timeUnit

        System.out.println("3000 year " + TimeUnit.DAYS.toSeconds(3000 * 365) + "s");
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s");

        // Date

        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDay() + "/" + (d.getMonth()+1) + "/" + (d.getYear()+1900));

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE) + "/" + (c.get(Calendar.MONTH )+1) + "/" + c.get(Calendar.YEAR));

        // Date format
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
        System.out.println(df.format(d));
    }
}
