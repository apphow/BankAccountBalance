package bankaccount;

public class BankAccount {

    private double balance;

    public BankAccount() {
        balance = 0.0;
            }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsuficientFundsException {
        if(amount > balance) {
            throw new InsuficientFundsException("Insufficient Balance.Withdraw process couldn't be completed");
        }

        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
