package com.test.qaz;

public class Main {
    public static void main(String[] args) {
        String randomText = new String("Я принимаю произвольный текст, и делю строку на Абзацы." +
                "Так-же, я вывожу кол-во слов в этом абзаце.");
        System.out.println("Тест");
        for (String degree : randomText.split(",")) {
            System.out.println(degree);
        }
    }
    public static void main2() {

    }
}
