import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo số ngẫu nhiên
        int n = random.nextInt();
        System.out.println("Random -2 tỷ - > 2 tỷ = " + n);

        // Tạo số ngẫu nhiên tham số 0 <= m <- 100
        int m = random.nextInt(100);
        System.out.println("Random số ngẫu nhiên tham số 0 <= m <- 100 = " + m);

        // Tạo số ngẫu nhiên tham số min <= m <- max
        int min = 100;
        int max = 999;

        int k = min + random.nextInt(max - min + 1);
        System.out.println("Random trong khoảng giới hạn = " + k);

        // String
        String[] fruits = {"Cam", "Quýt", "Xoài"};
        int ramdomindex = random.nextInt(fruits.length);
        String fruitsRandom = fruits[ramdomindex];
        System.out.println("fruitsRandom = " + fruitsRandom);

    }
}
