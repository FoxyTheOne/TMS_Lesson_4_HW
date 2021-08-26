package com.tms.hw03;

import java.util.Scanner;

/**
 *   3. Дана строка произвольной длины с произвольными словами.
 *   Написать программу для проверки является ли любое выюранное слово в строке полиндромом.
 *   Например, есть строка, вводится число 3, значит необходимо проверить является ли 3ей слово в этой строке полиндромом.
 *   Предусмотреть предупреждающие сообщения на случаи ошибочных ситуаций: например, в строке 5 слов, а на вход
 *   программе передали число 500 и т.п. ситуации.
 */

public class Main03 {
    public static void main(String[] args) {
        String str = "паараап pfd lol";

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите порядковый номер слова, которое хотите проверить: ");

        if (!sc.hasNextInt()) { // if (!sc.hasNextInt()) проверяет, является ли пользовательский ввод целым числом (sc - наш созданный объект)
            System.out.println("Вы ввели не целое число");
        } else {
            int number = sc.nextInt(); // number - переменная, в которую мы записали строку, введенную с консоли

            String[] arrayStr = str.split(" ");

            if (number > arrayStr.length) {
                System.out.println("Введенное число больше, чем слов в строке");
            } else if (number <= 0) {
                System.out.println("Введенное число - не положительное");
            } else {
                StringBuilder sb = new StringBuilder(arrayStr[number-1]);
                sb.reverse();
                String reverse = String.valueOf(sb);

                if (arrayStr[number-1].equals(reverse)) {
                    System.out.println("Слово " + arrayStr[number - 1] + "- полиндром");
                } else {
                    System.out.println("Слово " + arrayStr[number - 1] + "- не является полиндромом");
                }
            }
        }
    }
}
