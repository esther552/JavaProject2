package Accounts;

public class account {
    private float balance;

    public account() {
        this.balance = 500000;
    }

    public float withdraw(float amount) {
        if (amount <= balance) {
            balance -= amount;
        }else {
        }
        return amount;
    }
    public float getBalance()
        return balance;

}