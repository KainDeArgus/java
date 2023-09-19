import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings();
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(processStrings.countCh(string));
        System.out.println(processStrings.strOut(string));
        System.out.println(processStrings.reverse(string));
    }
}