import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(str);
        Date dateNow = new Date();
        System.out.println(dateNow.compareTo(date) > 0 ? "Введеная дата раньше текущей" : "Введеная дата позже текущей");
    }
}