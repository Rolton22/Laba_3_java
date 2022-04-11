package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
    }

//*7. Дана непустая строка. Вывести коды ее первого и последнего символа.

    private static void task1() {

        String ch = "Hello";
        System.out.println((int) ch.charAt(0));
        System.out.println((int) ch.charAt(ch.length() - 1));

    }
    //*30. Дан символ C и строки S, S0.
    // После каждого вхождения символа C в строку S вставить строку S0.

    private static void task2() {
        String S = "私の名生です";
        String S0 = "前は先";
        String C = "名";
        int position = -1;
        StringBuffer newString = new StringBuffer(S);
        while ((position = newString.indexOf(C, position + 1)) >= 0) {
            newString.insert(position + 1, S0);
        }
        System.out.println(newString);
    }

    private static void task3() {
        //*53. Дана строка-предложение заданное кириллицей.
        // Подсчитать количество содержащихся в строке знаков препинания.

        String S = "Дана строка-предложение заданное кириллицей. Вывести самое длинное слово в предложении. Если таких слов несколько, то вывести первое из них. Словом считать набор символов, не содержащий пробелов, знаков препинания и ограниченный пробелами, знаками препинания или началом/концом строки.\n";
        int len = S.length();
        int rep = S.replaceAll("[!.,;:?\\/-]", "").length();
        System.out.println("Количество знаков препинания в тексте: " + (len - rep));

    }

}