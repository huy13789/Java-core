package vti.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    protected int id;
    protected String fullName;
    protected String email;
    protected String password;
    protected int projectId;
}
