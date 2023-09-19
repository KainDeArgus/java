import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        SystemOut(x);
        System.out.println();
        int N = scanner.nextInt();
        System.out.println(SummNumbers(N));
        System.out.println(ReverseNumber(N));
        NumbersLeftToRight(N);
    }

    public static void SystemOut(int n) {
        if (n > 1) {
            SystemOut(n - 1);
        }
        System.out.print(n + " ");
    }

    public static int SummNumbers(int N) {
        return SummNumbers(N, 0);
    }

    private static int SummNumbers(int N, int sum) {
        sum += N % 10;
        if (N > 0)
            return SummNumbers(N / 10, sum);
        else return sum;
    }

    public static int ReverseNumber(int N) {
        return ReverseNumber(N, 0);
    }

    private static int ReverseNumber(int N, int rN) {
        if (N > 0) {
            rN = rN * 10 + N % 10;
            return ReverseNumber(N / 10, rN);
        } else return rN;
    }

    public static void NumbersLeftToRight(int N) {
        if (N > 9) {
            NumbersLeftToRight(N / 10);
        }
        System.out.print(N % 10 + " ");
    }
}