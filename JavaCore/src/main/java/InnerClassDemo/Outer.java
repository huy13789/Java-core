package InnerClassDemo;

public class Outer {
    private int value;

    public Outer(int value) {
        this.value = value;
    }

    public class Inner {
        public void ShowInfo() {
            System.out.println("value = " + value);
        }
    }

    public static class Nested {
        public void ShowInfo() {
            System.out.println("value = ");
        }
    }
}
