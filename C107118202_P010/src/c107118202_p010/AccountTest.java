package c107118202_p010;

public class AccountTest {

    public static void main(String[] args) {
        Account no_arg = new Account(1122, 20000);
        no_arg.info();
        System.out.println("-----------------------");
        Account no_arg_no = new Account();
        no_arg_no.setId(1123, 20000);
        no_arg_no.info();
    }

}
