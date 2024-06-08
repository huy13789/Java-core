import java.util.Objects;

public class Dog {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Dog)) return true;
        Dog that = (Dog) obj;
        return this.name.equals(that.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return String.format("Name = %s, Age = %d", name, age);
    }
}
