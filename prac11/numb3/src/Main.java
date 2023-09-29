import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String format = "dd.MM.yyyy HH:mm:ss";
        System.out.println(format);
        String str = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(str);
        Student student = new Student("Oleg", 22, 3.4);
        student.setBd(date);
        student.outDate();
    }
}