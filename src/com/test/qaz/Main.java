package com.test.qaz;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Тест");
        for (int i = 0; i < args.length; i++) {
            for (String degree : args[i].split(",")) {
                System.out.println(degree);
                int count = 0;
                if (degree.length() != 0) {
                    count++;
                    for (int j = 0; j < degree.length(); j++) {
                        if (degree.charAt(j) == ' ') {
                            count++;
                        }
                    }
                }
                System.out.println("Вы ввели " + count + " слов");
        }

        }
    }
}