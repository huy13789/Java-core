package com.vti.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static String inputString() {
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}", " ");
    }

    public static int inputInt() {
        while (true) {
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputFullName() {
        while (true) {
            String input = inputString();
            if (hasAllAlphabetic(input)) {
                return input;
            } else {
                System.err.println("Yêu cầu full name chỉ chứa chữ");
                System.out.println("Nhập lại:");
            }
        }
    }

    private static boolean hasAllAlphabetic(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c))
                continue;
            if (!Character.isAlphabetic(c))
                return false;
        }
        return true;
    }

    public static String inputEmail() {
        while (true) {
            String input = inputString();
            if (input.contains("@")) {
                return input;
            } else {
                System.err.println("Yêu cầu email chứa kí tự @");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String input = inputString();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.err.println("Yêu cầu password từ 6 tới 12 kí tự");
                System.err.println("Nhập lại:");
            } else if (hasAnyUppercase(input)) {
                return input;
            } else {
                System.err.println("Yêu cầu password có ít nhất 1 kí tự viết hoa");
                System.err.println("Nhập lại:");
            }
        }
    }

    private static boolean hasAnyUppercase(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}