import Entity.Dog;

public class AccessModifyDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập
    // public: Mọi nơi
        Dog dog1 = new Dog("Long", 2);
        System.out.println("dog1.name = " + dog1.name);

    // protected: Cùng package hoặc class con
        Dog dog2 = new Dog("Long", 2);
    // System.out.println("dog2.age = " + dog2.age);

    // default: Cùng package
        Dog dog3 = new Dog("Long", 2);
    // System.out.println("dog3.color = " + dog3.color);

    // private: Cùng class
        Dog dog4 = new Dog("Long", 2);
    // System.out.println("dog4.id = " + dog4.id);
    }

}
