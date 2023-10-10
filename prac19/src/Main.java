import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static boolean isCorrectINN(String INN){
        if(INN.length()!=12)
            return false;
        return Pattern.matches("\\d{12}", INN);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("fio: ");
        String fio = scanner.nextLine();
        System.out.print("INN: ");
        try {
            String INN = scanner.next();
            if (!isCorrectINN(INN))
                throw new INNException(INN);
            else System.out.println("Order was made");
        }catch (INNException e){
            System.out.println(e.getMessage());
        }
    }
}