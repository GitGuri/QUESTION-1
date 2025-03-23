
public class AccountTest {

    public static void main(String[] args) {
        Account account=new Account(400.89,"leeroy");
        account.withdraw(12);
        System.out.println("Current balance after withdrawal: " + account.getBalance());

        account.deposit(1200);
        System.out.println("Current balance after deposit: " + account.getBalance());





}
}