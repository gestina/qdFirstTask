package com.test.qaz;

import java.util.StringTokenizer;

public class FirstTask2 {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer = new StringTokenizer("Я принимаю произвольный текст,и делю строку на Абзацы," +
                "Так-же я вывожу кол-во слов в этом абзаце.", ",");

        int count = stringTokenizer.countTokens();
        System.out.println("Всего абзацев: " + count);

        for (int i = 0; i < count; i++) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}