package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static long fact(int a) {
        long b = 1;
        for (int i = 1; i < a; i++) b *= i;
        return b;
    }

    public static void main(String[] args) {
        int[] mass_int = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum_mass = 0;
        for (int i : mass_int) sum_mass += i;
        System.out.println(sum_mass / mass_int.length);

        Scanner in = new Scanner(System.in);
        int len_mass;
        len_mass = in.nextInt();
        mass_int = new int[len_mass];
        for (int i = 0; i < mass_int.length; i++) mass_int[i] = in.nextInt();
        sum_mass = 0;
        int j = 0;
        do {
            sum_mass += mass_int[j];
            j++;
        } while (j < mass_int.length);
        System.out.println(sum_mass);
        sum_mass = j = 0;
        int max = 0, min = mass_int[0];
        while (j < mass_int.length) {
            sum_mass += mass_int[j];
            if (mass_int[j] > max) max = mass_int[j];
            if (mass_int[j] < min) min = mass_int[j];
            j++;
        }
        System.out.println(sum_mass);
        System.out.println(max);
        System.out.println(min);

        for (String arg : args) System.out.println(arg);

        double a;
        for (int i = 0; i < 10; i++) {
            a = (double) 1 / (i + 1);
            System.out.printf("%.2f  ", a);
        }

        System.out.println();
        System.out.println(fact(10));
    }
}