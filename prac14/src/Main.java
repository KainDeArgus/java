import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        Pattern p2 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m2 = p2.matcher(s);
        System.out.println(s + ": " + m2.matches());

        Pattern p4 = Pattern.compile("\\+\\s*\\d+");
        s = scanner.nextLine();
        Matcher m4 = p4.matcher(s);
        System.out.println(s + ": " + m4.find());

        Pattern p6 = Pattern.compile("(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*");
        s = scanner.nextLine();
        Matcher m6 = p6.matcher(s);
        System.out.println(s + ": " + m6.matches());

    }
}