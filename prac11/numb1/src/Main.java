import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Date date = new Date();
        Date date1 = new Date();
        date1.setTime(1695200000000L);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_MONTH, 23);
        cal.set(Calendar.YEAR, 2023);
        cal.set(Calendar.MONTH, 9);
        cal.setTime(date1);
        System.out.println("Махов Я. А., дата получаения задания " + sdf.format(cal.getTime())+ " Дата сдачи " + sdf.format(date));
    }
}