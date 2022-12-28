package com.test.qaz;

public class Main {
    public static void main(String[] args) {
        String randomText = new String("Я принимаю произвольный текст,и делю строку на Абзацы," +
                "Так-же я вывожу кол-во слов в этом абзаце.");

        System.out.println("Тест");

        for (String degree : randomText.split(",")) {
            System.out.println(degree);
            int count = 0;
            if (degree.length() != 0) {
                count++;
                for (int i = 0; i < degree.length(); i++) {
                    if (degree.charAt(i) == ' ') {
                        count++;
                    }
                }
            }
            System.out.println("Вы ввели " + count + " слов");
        }
    }
}