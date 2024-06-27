package com.vti.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String inputString(){
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}", "");
    }
    public static int InputInt(){
        while (true){
            try {
                String input = inputString();
                return Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.err.println("Yeu cau nhap so nguyen");
                System.out.println("Nhap lai");
            }

        }
    }

    public static String InputFullName(){
        return inputString();
    }
    public static String InputEmail(){
        return inputString();
    }
}
