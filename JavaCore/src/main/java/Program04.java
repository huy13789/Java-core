import java.util.Scanner;

public class Program04 {
    void question01(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập vào chuổi kí tự");
        String s = scanner.nextLine();
        String[] words = s.split("");
        for (String word : words) {
            if (word.isEmpty()){
                System.out.println("words = " + words);
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    void question02(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuổi kí tự 1:");
        String s = scanner.nextLine();
        System.out.println("Nhập vào chuổi kí tự 2:");
        String s1 = scanner.nextLine();
        System.out.println("2 chuổi vừa nhập là:\n" + s  + " " + s1);

    }

    String question10(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 !=  length2) {
            return "KO";
        }
        for (int i = 0; i < length1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1 - 1 - i);
            if (c1 != c2) {
                return "KO";
            }
        }
        return "OK";
    }

    String question15(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        return result.trim();
    }

}
