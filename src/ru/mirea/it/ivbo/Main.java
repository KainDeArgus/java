package ru.mirea.it.ivbo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] mass_int = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double sum_mass = 0;
        for (int j : mass_int) sum_mass += j;
        System.out.println(sum_mass/mass_int.length);

        Scanner in = new Scanner(System.in);
        int len_mass;
        len_mass = in.nextInt();
        mass_int = new int[len_mass];
        for(int i = 0; i < mass_int.length; i++) mass_int[i] = in.nextInt();
        sum_mass = 0;
        int i = 0;
        do{
            sum_mass += mass_int[i];
            i++;
        }while (i < mass_int.length);
        System.out.println(sum_mass);
        sum_mass = i = 0;
        int max = 0, min = mass_int[0];
        while (i < mass_int.length){
            sum_mass += mass_int[i];
            if(mass_int[i] > max) max = mass_int[i];
            if(mass_int[i] < min) min = mass_int[i];
            i++;
        }
        System.out.println(sum_mass);
        System.out.println(max);
        System.out.println(min);
    }
}