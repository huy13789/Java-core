public class forIndexDemo {
    public static void main(String[] args) {
        for (int i =1 ; i <= 10; i++){
            System.out.println("i = " + i);
        }

        for (int i =10 ; i >= 1; i--){
            System.out.println("i = " + i);
        }

        // viết tắt : fori để tự nhảy ra vòng for kèm i

        // Lập các phần tử trong array
        int n[] = {4, 9 , 6, 2, 5, 1};
        for (int i = 0; i < n.length; i++) {
            System.out.println("n[i] = " + n[i]);
        }
    }
}
