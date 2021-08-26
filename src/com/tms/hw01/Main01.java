package com.tms.hw01;

/**
 *   1. Дана строка произвольной длины с произвольными словами.
 *   Найти самое короткое слово в строке и вывести его на экран.
 *   Найти самое длинное слово в строке и вывести его на экран.
 *   Если таких слов несколько, то вывести последнее из них.
 */

public class Main01 {
    public static void main(String[] args) {
        String str = "Дана строка произвольной длины с произвольными словами";

        if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            String[] arrayStr = str.split(" ");

            // Найти самое короткое слово в строке и вывести его на экран:
            String smallestWord = arrayStr[0];
            // Сравниваем длину каждого массива с самым первым. Если длина меньше, перезаписываем переменную.
            for (int i = 1; i < arrayStr.length; i++) {
                if (arrayStr[i].length() < smallestWord.length()) {
                    smallestWord = arrayStr[i];
                }
            }
            System.out.println("Самое короткое слово в строке - \"" + smallestWord + "\"");

            // Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.
            String longestWord = arrayStr[0];
            // Сравниваем длину каждого массива с самым первым. Если длина больше, перезаписываем переменную.
            // Если длина такая же - тоже заменяем, т.к. нужно вывести последнее слово
            for (int i = 1; i < arrayStr.length; i++) {
                if (arrayStr[i].length() >= longestWord.length()) {
                    longestWord = arrayStr[i];
                }
            }
            System.out.println("Последнее самое длинное слово в строке - \"" + longestWord + "\"");
        }

    }
}
