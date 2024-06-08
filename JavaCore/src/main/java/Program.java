import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        // Tạo các đối tượng Department và Position
        Department salesDepartment = new Department(1, "Sales");
        Position developerPosition = new Position(1, PositionName.DEV);

        Account[] accounts = new Account[3];

        Account nv1 = new Account();

        nv1.accountId = 1;
        nv1.mail = "huy13789@gmail.com";
        nv1.fullName = "Ngo Nguyen Huy";;
        nv1.userName = "JCD";
        nv1.departmentId = salesDepartment;
        nv1.positionId = developerPosition;
        nv1.createDate = LocalDate.now();

        String nv1Info = "nv1 ID: " + nv1.accountId +
                ", Email: " + nv1.mail +
                ", Username: " + nv1.userName +
                ", Full Name: " + nv1.fullName +
                ", Department ID: " + nv1.departmentId +
                ", Position ID: " + nv1.positionId +
                ", Create Date: " + nv1.createDate;

        Account nv2 = new Account();

        nv2.accountId = 1;
        nv2.mail = "huy13789@gmail.com";
        nv2.fullName = "Ngo Nguyen Huy";;
        nv2.userName = "JCD";
        nv2.departmentId = null;
        nv2.positionId = developerPosition;
        nv2.createDate = LocalDate.now();

        String nv2Info = "nv2 ID: " + nv2.accountId +
                ", Email: " + nv2.mail +
                ", Username: " + nv2.userName +
                ", Full Name: " + nv2.fullName +
                ", Department ID: " + nv2.departmentId +
                ", Position ID: " + nv2.positionId +
                ", Create Date: " + nv2.createDate;
        
    }
}
