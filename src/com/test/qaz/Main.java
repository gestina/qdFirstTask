package com.test.qaz;

public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            for (String degree : arg.split(",")) {
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