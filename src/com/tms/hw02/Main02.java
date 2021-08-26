package com.tms.hw02;

/**
 * 2. Дана строка произвольной длины с произвольными словами.
 *   Найти слово, в котором число различных символов минимально. Слово может содержать буквы и цифры.
 *   Если таких слов несколько, найти первое из них.
 *   Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */

public class Main02 {
    public static void main(String[] args) {
        String str = "abcde fffff ab f 1234 jkjk aaaaa";

        if (str.isEmpty()) {
            System.out.println("Строка пустая");
        } else {
            String[] arrayStr = str.split(" ");

            int amountOfNotMatch = 0;
            String resultWord;

            // Для начала проверяем первое слово (arrayStr[0]). letterForComparing - это первая буква слова, которую мы сравниваем с остальными буквами слова. И далее в этой переменной проходимся по всем буквам слова
            for (int letterForComparing = 0; letterForComparing < arrayStr[0].length() - 1; letterForComparing++) {

                // compareWith - остальные буквы слова, с которыми мы сравниваем каждое letterForComparing
                for (int compareWith = 0; compareWith < arrayStr[0].length() - 1; compareWith++) {
                    char ch = arrayStr[0].charAt(letterForComparing);
                    if (ch != arrayStr[0].charAt(compareWith + 1)) {
                        amountOfNotMatch++;
                    }
                }
            }

            // Получаем первое число, от которого можем отталкиваться и сравнивать остальное. Записали его в переменную minAmountOfNotMatch
            int minAmountOfNotMatch = amountOfNotMatch;
            resultWord = arrayStr[0];

            // Теперь проверяем каждое слово в строке, по порядку. checkWords - номер слова в строке
            for (int checkWords = 0; checkWords < arrayStr.length; checkWords++) {

                amountOfNotMatch = 0; // Обнуляем для нового подсчёта совпадений в слове

                // letterForComparing - это первая буква слова, которую мы сравниваем с остальными буквами слова. И далее в этой переменной проходимся по всем буквам слова
                for (int letterForComparing = 0; letterForComparing < arrayStr[checkWords].length() - 1; letterForComparing++) {

                    // compareWith - остальные буквы слова, с которыми мы сравниваем каждое letterForComparing
                    for (int compareWith = 0; compareWith < arrayStr[checkWords].length() - 1; compareWith++) {
                        char ch = arrayStr[checkWords].charAt(letterForComparing);
                        if (ch != arrayStr[checkWords].charAt(compareWith + 1)) {
                            amountOfNotMatch++;
                        }
                    }
                }

                if (minAmountOfNotMatch > amountOfNotMatch) { // Перезаписываем переменную, если число различных символов в слове меньше
                    minAmountOfNotMatch = amountOfNotMatch;
                    resultWord = arrayStr[checkWords];
                }
            }

            System.out.println(resultWord);


















//            int countingCharInArray = 1;
//            int max = 0;
//            String minDifferentChar = " ";
//            for (int i = 0; i < arrayStr.length; i++) { // Проверяем каждое слово по порядку
//                for (int k = 1; k < arrayStr[i].length(); k++) { // Проходим по каждому символу i-того слова в строке
//                    char ch = arrayStr[i].charAt(k);
//                    if (ch == arrayStr[i].charAt(k - 1)) {
//                        countingCharInArray++;
//                    }
//                    if (countingCharInArray > max) {
//                        max = countingCharInArray;
//                        minDifferentChar = arrayStr[i];
//                    }
//
//                }
//
//            }
//            System.out.println(minDifferentChar);

        }
    }
}
