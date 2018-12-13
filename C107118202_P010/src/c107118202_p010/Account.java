package c107118202_p010;

public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account(int userId, int userMoney) {
        id = userId;
        balance = userMoney;
        System.out.println("新物件產生!有帳戶餘額");
    }

    public double getMonthlyInterestRate() {
        return 0.045 / 12;
    }

    public double getMonthlyInterest() {
        return (balance - withdraw() + deposit()) * getMonthlyInterestRate();
    }

    public void setId(int userId, int userMoney) {
        balance = userMoney;
        id = userId;
    }

    public Account() {
        System.out.println("新物件產生!沒有帳戶餘額");
    }

    public double deposit() {
        return 200.0;
    }

    public double withdraw() {
        return 1000.0;
    }

    public void info() {
        System.out.printf("帳戶代碼(ID)為 %d\n", id);
        System.out.printf("帳戶原始餘額為 %.1f\n", balance);
        System.out.printf("存入：%.1f\n", deposit());
        System.out.printf("提款：%.1f\n", withdraw());
        System.out.printf("帳戶更新後餘額為 %.1f\n", balance - withdraw() + deposit());
        System.out.printf("月利息為：%.1f\n", getMonthlyInterest());
        System.out.printf("年利率為：%.1f\n", getMonthlyInterestRate() * 12*100);
    }
}
