import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, month, date, hour, minutes;
        System.out.println("Enter year, month, date, hour, minutes");
        year = sc.nextInt();
        month = sc.nextInt();
        date = sc.nextInt();
        hour = sc.nextInt();
        minutes = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, date);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minutes);

        Date d = cal.getTime();


        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println(sdf.format(d));
        System.out.println(sdf.format(cal.getTime()));
    }
}