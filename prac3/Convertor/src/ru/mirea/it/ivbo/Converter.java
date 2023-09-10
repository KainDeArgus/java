package ru.mirea.it.ivbo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("France - fr\t\tKorea - ko\t\tUS - en\t\tJapan - ja");
        System.out.println("Примечание: запятая при выводе евро - разделитель дробной и целой частей, в остальных же случаях - разделитель трёх старших разрядов целых чисел.");
        System.out.print("Введите текущую локализацию: ");
        String lc = scanner.next();
        Locale locale;
        switch (lc) {
            case "fr":
                locale = Locale.FRANCE;
                break;
            case "ko":
                locale = Locale.KOREA;
                break;
            case "en":
                locale = Locale.US;
                break;
            case "ja":
                locale = Locale.JAPAN;
                break;
            default:
                System.out.println("Вы ввели некорректные данные. Попробуйте снова.");
                return;
        }

        double NumberInstance;
        System.out.print("Введите значение валюты: ");
        NumberInstance = scanner.nextDouble();

        System.out.print("Введите нужную локализацию: ");
        String lcN = scanner.next();
        lc += "-" + lcN;
        Locale localNext;
        switch (lcN) {
            case "fr":
                localNext = Locale.FRANCE;
                break;
            case "ko":
                localNext = Locale.KOREA;
                break;
            case "en":
                localNext = Locale.US;
                break;
            case "ja":
                localNext = Locale.JAPAN;
                break;
            default:
                System.out.println("Вы ввели некорректные данные. Попробуйте снова.");
                return;
        }

        double NumberInstanceNext = 1;
        switch (lc) {
            case "fr-ko":
                NumberInstanceNext = 1428.21;
                break;
            case "fr-en":
                NumberInstanceNext = 1.07;
                break;
            case "fr-ja":
                NumberInstanceNext = 157.35;
                break;
            case "ko-fr":
                NumberInstanceNext = 0.0007;
                break;
            case "ko-en":
                NumberInstanceNext = 0.00075;
                break;
            case "ko-ja":
                NumberInstanceNext = 0.110169;
                break;
            case "en-fr":
                NumberInstanceNext = 0.933613;
                break;
            case "en-ko":
                NumberInstanceNext = 1333.4;
                break;
            case "en-ja":
                NumberInstanceNext = 146.9;
                break;
            case "ja-fr":
                NumberInstanceNext = 0.006355;
                break;
            case "ja-en":
                NumberInstanceNext = 0.006807;
                break;
            case "ja-ko":
                NumberInstanceNext = 9.08;
                break;
        }
        System.out.print("У вас есть " + NumberFormat.getCurrencyInstance(locale).format(NumberInstance));
        System.out.print(" или " + NumberFormat.getCurrencyInstance(localNext).format(NumberInstance * NumberInstanceNext));
    }
}