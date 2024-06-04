import java.util.Scanner;

public class ScannersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Nhập họ tên");
//        String fullName = scanner.nextLine();
//        System.out.println(" Họ tên = \n" + fullName);

        System.out.println(" 1. Name \n 2. Nữ");
        int menu = scanner.nextInt();
        Gender gender;
        if(menu == 1){
            gender = Gender.MALE;
        }else {
            gender = Gender.FEMALE;
        }
        scanner.nextLine();
        //gender = Gender.valueOf(String.valueOf(menu));
        System.out.println("Sex = " + gender);
    }
}
