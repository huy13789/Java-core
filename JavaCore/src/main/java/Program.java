import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Account account = new Account();

        account.accountId = 1;
        account.mail = "huy13789@gmail.com";
        account.fullName = "Ngo Nguyen Huy";;
        account.userName = "JCD";
        account.departmentId = new Department();
        account.positionId = new Position();
        account.createDate = LocalDate.now();

        String accountInfo = "Account ID: " + account.accountId +
                ", Email: " + account.mail +
                ", Username: " + account.userName +
                ", Full Name: " + account.fullName +
                ", Department ID: " + account.departmentId +
                ", Position ID: " + account.positionId +
                ", Create Date: " + account.createDate;

        System.out.println(accountInfo);
    }
}
