import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long start, lastedArr, lastedList;
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            arr.add(i);
        }
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            list.add(i);
        }
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println(lastedArr > lastedList ? "быстрее List" : "быстрее Array");
        System.out.println();

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            arr.remove(0);
        }
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            list.remove(0);
        }
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println(lastedArr > lastedList ? "быстрее List" : "быстрее Array");
        System.out.println();

        arr.add(12);
        list.add(12);

        start = System.currentTimeMillis();
        arr.contains(12);
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        list.contains(12);
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println(lastedArr > lastedList ? "быстрее List" : "быстрее Array");
    }
}