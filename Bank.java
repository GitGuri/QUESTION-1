import java.io.IOException;
import java.io.FileWriter;

abstract class Bank {
     double balance;
     protected String accountName;

    public Bank( double balance, String accountName ) {

        this.balance = balance;
        this.accountName = accountName;
    }

    public void withdraw(double amount){}
    public void deposit(double amount){}
    public abstract double getBalance();

    // Method to log transactions to a file
    public void logTransaction(String transaction) {
        try (FileWriter writer = new FileWriter("Bank.txt", true)) {
            writer.write(transaction + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while logging the transaction.");
            e.printStackTrace();
        }
    }
}
