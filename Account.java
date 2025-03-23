public class Account extends Bank{
    public Account(double balance,String accountName){
        super(balance,accountName);
    }

    @Override
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Withdrawal amount exceeds balance");
        }
        else{balance-=amount;
        System.out.println("Withdrawal Successful");
        logTransaction("Withdrawal: -" + amount);}

    }

    @Override
    public void deposit(double amount){
        if(amount<0){
            System.out.println("NO Deposits less than 0");
        }
        else{balance+=amount;
            logTransaction("Deposit: +" + amount);
        }}


    @Override
    public double getBalance(){
        logTransaction("Balance check: " + balance);
        return balance;

    }


}


