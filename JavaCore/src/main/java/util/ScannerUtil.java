package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static int inputPositiveInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                int n = Integer.parseInt(input);
                if (n > 0) {
                    return n;
                } else {
                    System.err.println("Yêu cầu nhập vào số nguyên dương.");
                    System.err.println("Nhập lại:");
                }
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số nguyên.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static float inputFloat() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số thực.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static double inputDouble() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException exception) {
                System.err.println("Yêu cầu nhập vào số thực.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }

    public static String inputEmail() {
        while (true) {
            String input = scanner.nextLine();
            if (input.contains("@")) {
                return input;
            } else {
                System.err.println("Yêu cầu email chứa kí tự @.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String input = scanner.nextLine();
            int length = input.length();
            if (length < 6 || length > 12) {
                System.err.println("Yêu cầu password từ 6 đến 12 kí tự.");
                System.err.println("Nhập lại:");
            } else {
                for (int i = 0; i < length; i++) {
                    char c = input.charAt(i);
                    if (Character.isUpperCase(c)) {
                        return input;
                    }
                }
                System.err.println("Yêu cầu password ít nhất 1 kí tự viết hoa.");
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputFullName() {
        while (true) {
            String input = scanner.nextLine();
            if (hasAllAlphabetic(input)) {
                return input;
            } else {
                System.err.println("Yêu cầu full name chỉ chứa chữ cái.");
                System.err.println("Nhập lại:");
            }
        }
    }

    private static boolean hasAllAlphabetic(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isWhitespace(c)) continue;
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
}