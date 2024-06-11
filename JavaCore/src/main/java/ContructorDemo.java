import Entity.Dog;

public class ContructorDemo {
    // 1. Trùng với tên class
    // 2. Ko có kiểu dữ liệu trả vè
    public static void main(String[] args) {
        Dog dog = new Dog("Đạt", 22);
        System.out.println("dog = " + dog);
    }
}
