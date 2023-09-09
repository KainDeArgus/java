package ru.mirea.it.ivbo;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(10, 5.5);
        System.out.println("1. " + ball1 + "\n2. " + ball2);
        System.out.println("1. Input X:");
        x = scanner.nextDouble();
        ball1.setX(x);
        System.out.println("Ball1 in X: " + ball1.getX());
        System.out.println("2. Input Y:");
        y = scanner.nextDouble();
        ball2.setY(y);
        System.out.println("Ball2 in Y: " + ball2.getY());
        System.out.println("1. Input X and Y:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball1.setXY(x, y);
        System.out.println("1. " + ball1);
        System.out.println("2. Input X_disp and Y_disp:");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        ball2.move(x, y);
        System.out.println("2. " + ball2);
    }
}