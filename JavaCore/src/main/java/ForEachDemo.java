import java.util.Arrays;

public class ForEachDemo {
    public static void main(String[] args) {
        // Lập các phần tử
        int n[] = {4, 9 , 6, 2, 5, 1};
        for(int number : n){
            System.out.println("number = " + number);
        }

        Arrays.sort(n);
        for(int number : n){
            System.out.println("number = " + number);

        }
        
    }
}
