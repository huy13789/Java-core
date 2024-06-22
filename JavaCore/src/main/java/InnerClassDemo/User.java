package InnerClassDemo;

public class User {
    private int id;
    private String username;
    private String password;
    private Gender gender;
    private Role role;

    public enum Gender {
        MALE, FEMALE;
    }

    public enum Role {
        ADMIN, MANAGER, EMPLOYEE
    }
}