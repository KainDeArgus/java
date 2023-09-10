package ru.mirea.it.ivbo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class ArrayRandomNumbers {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        Random random = new Random();
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextDouble() * 100;
        System.out.println("Первый массив, созданный с помощью класса Random:");
        for (double v : array) System.out.print(decimalFormat.format(v) + "\t");
        System.out.println("\nОтсортированный первый массив:");
        Arrays.sort(array);
        for (double v : array) System.out.print(decimalFormat.format(v) + "\t");
        System.out.println("\n\nВторой массив, созданный с помощью метода random() класса Math:");
        for (int i = 0; i < array.length; i++)
            array[i] = Math.random() * 100;
        for (double v : array) System.out.print(decimalFormat.format(v) + "\t");
        System.out.println("\nОтсортированный Второй массив:");
        Arrays.sort(array);
        for (double v : array) System.out.print(decimalFormat.format(v) + "\t");
    }
}