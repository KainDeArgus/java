import java.util.Objects;
import java.util.Scanner;

public class ThrowDemo2 {
    public  void getKey(){
        Scanner myScanner = new Scanner( System.in );
        String key="";
        while(key.equals("")){
            System.out.print("key: ");
            key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Try again");
            }
        }
    }
    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
    private String getDetails(String key){
        if(Objects.equals(key, "")) {
            throw new RuntimeException( "Key set to empty string" );
        }
        return "data for " + key; }
}